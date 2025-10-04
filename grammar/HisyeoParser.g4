parser grammar HisyeoParser;

options {
    tokenVocab=HisyeoLexer;
}

import HisyeoWordParser;

sentences
    : sentence (Period sentence)* Period?
    ;

sentence
    : freeAgentConstituent constituent* ( connector sentence )* postposition?
    | restrictedSentence
    ;

restrictedSentence
    : constituent+ ( connector sentence )* postposition?
    ;

freeAgentConstituent
    : prepPhrase
    ;

constituent
    : preposition
    | verbMarker? transitiveVerb verbModifier* nounPhrase?
    ;

modifierClause
    : <assoc=right> Et? Ye ( expandedWord modifierClause* | subordinateClause )
    | Et ( nonVerbWord modifierClause* | subordinateClause  )
    | nonVerbWord
    | subordinateClause (postposition? Comma)??
    | ProperNoun
    ;

subordinateClause
    : Fos sentence
    | Xe restrictedSentence
    ;

transitiveVerb
    : baseVerb | Li
    ;

quantity
    : relativeQuantity? nominalQuantity+ 
    ;

preposition
    : prepParticle prepPhrase
    ;

// Must update if words change
prepParticle
    : U|Ole|Hon|Til|Hoi|To|Mut|Ofek|Sun|Bi|Nenko|Oldis|Den|Lon|Gitno|Misli|Ilik|Cihou
    ;

nounPhrase
    : quantity? subordinateClause (Comma modifierClause*)?
    | quantity? expandedWord modifierClause*
    ;

prepPhrase
    : nounPhrase (connector nounPhrase)*
    ;

contentWord
    : baseNoun
    | baseVerb 
    | baseModifier
    ;

nonVerbWord
    : ( pronoun
      | relativeQuantity
      | nominalQuantity
      | baseNoun
      | baseModifier )
    ;

expandedWord
    : ( pronoun
      | relativeQuantity
      | nominalQuantity
      | contentWord )
    ;

// Must update if words change
contentParticles
    : (In|Des) (Oni|Foko|Kon)?
    | (Oni|Foko|Kon) (In|Des)?
    ;

baseVerb: contentParticles? rawVerbs ;

// Must update if words change
verbMarker
    : Koi
    | Bit
    | Kuu
    | Ke
    ;

// Must update if words change
verbModifier
    : Yok
    | Eo
    | Si
    ;

baseNoun: contentParticles? rawNouns ;

baseModifier: contentParticles? rawModifiers ;

// Must update if words change
relativeQuantity
    : Odigon
    | Eswen
    | Eto
    | Ilik
    | Cihou
    | Xokon
    | Zotesto
    | Buzok
    | Felcin
    | Moi
    | Menus
    | Youti
    ;

// Must update if words change
nominalQuantity
    : Onsu
    | Kinse
    | Kut
    | Tou
    | Telo
    | Tiu
    | Eson
    | Tukwos
    | Elfu
    | Fun
    | Niswi
    | Ses
    | Xeti
    | Xunyu
    | Dus
    | Dui
    | Ziyon
    | Bole
    | Fiyen
    | Nonku
    ;
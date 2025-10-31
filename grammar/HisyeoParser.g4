parser grammar HisyeoParser;

options {
    tokenVocab=HisyeoLexer;
}

import HisyeoWordParser;

sentencesStrict
    : sentences EOF
    ;

sentenceStrict
    : sentence EOF
    ;

nounPhraseStrict
    : prepPhrase EOF
    ;

sentences
    : (QuestionStart? sentence sentencePunctuation)+?
    ;

sentencePunctuation
    : Period
    | Colon
    | QuestionEnd
    ;

sentence
    : freeAgentConstituent constituent* prepParticle? postposition?
    | connector? restrictedSentence
    | interjection
    ;

restrictedSentence
    : constituent+ prepParticle? postposition?
    ;

freeAgentConstituent
    : nounPhrase (connector prepPhrase)*
    ;

constituent
    : prepParticle prepPhrase                        #preposition
    | verbMarker? Li verbModifier* prepPhrase        #copulativePreposition
    | verbMarker? rawVerbs verbModifier* prepPhrase? #verbalPreposition
    ;

adjectivalClause
    : <assoc=right> Et? Ye ( adjectivalNucleus adjectivalClause* | subordinateClause )
    | Et ( nominalNucleus adjectivalClause* | subordinateClause  )
    | nominalNucleus
    | subordinateClause (postposition? Comma)??
    | Et? ProperNoun
    ;

adjectivalNucleus
    : nominalNucleus
    | rawVerbs
    ;

subordinateClause
    : Fos sentence prepParticle?
    | Xe restrictedSentence
    ;

quantity
    : relativeQuantity? nominalQuantity+
    | relativeQuantity
    ;

// Must update if words change
prepParticle
    : U|Ole|Noi|Hon|Til|Hoi|To|Mut|Ofek|Sun|Bi|Nenko|Oldis|Den|Lon|Gitno|Misli|Ilik|Cihou
    ;

nounPhrase
    : quantity? subordinateClause (Comma adjectivalClause*)?
    | quantity? nominalNucleus adjectivalClause*
    | QuotationStart sentences QuotationEnd
    ;

verbalNounPhrase
    : quantity? rawVerbs adjectivalClause*
    ;

prepPhrase
    : (nounPhrase|verbalNounPhrase) (connector (nounPhrase|verbalNounPhrase))*
    ;

nominalNucleus
    : pronoun
    | relativeQuantity
    | nominalQuantity
    | baseNoun
    | verbalNoun
    | baseModifier
    ;

// Must update if words change
verbalParticles
    : (In|Des) (Oni|Foko|Kon)?
    | (Oni|Foko|Kon) (In|Des)?
    ;

verbalNoun: verbalParticles rawVerbs ;

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

// Must update if words or secondary interjections change
interjection
    : Bioli
    | Oiyo
    | Yok
    ;

contentParticles
    : (In|Des) (Oni|Foko|Kon)?
    | (Oni|Foko|Kon) (In|Des)?
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
    | Boit
    | Nonku
    ;
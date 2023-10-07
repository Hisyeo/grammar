parser grammar KokanuParser;

options {
    tokenVocab=KokanuLexer;
}

sentences
    : sentence (Period sentence)* Period?
    ;


sentence
    : sentenceClause ( connector sentenceClause )*
    ;

sentenceClause
    : preposition?
      ( noun ( connector noun )* )*
      preposition?
      ( (Le|O) No? transVerbPhrase (newAgentAdjClause terminator)?
      | (Le|O) No? verb)+
      preposition?
      ( connector preposition )*
    ;

noun
    : ( quantity? nounClause terminator modifierClause*
      | quantity? expandedWord modifierClause* )
    ;

nounClause
    : sameAgentAdjClause
    | newAgentAdjClause
    ;

modifierClause
    : <assoc=right> Je
      ( expandedWord modifierClause*
      | sameAgentAdjClause
      | newAgentAdjClause )
    | Wo
      ( expandedWord modifierClause*
      | sameAgentAdjClause
      | newAgentAdjClause  )
    | ( expandedWord
      | sameAgentAdjClause  Comma?
      | newAgentAdjClause  )
    ;

newAgentAdjClause
    : Ta sentenceClause 
    ;

sameAgentAdjClause
    : Te We? transVerbPhrase newAgentAdjClause? preposition?
    | Te We? verb preposition?
    ;

terminator
    : Comma
    | Period
    | EOF
    ;


verb
    : baseModifier modifierClause*
    | baseNoun modifierClause*
    ;


transVerbPhrase
    : baseVerb modifierClause*
    ;

quantity
    : relativeQuantity? nominalQuantity+ 
    ;


preposition
    : prepClause (Comma? prepClause)*
    ;

prepClause
    : ( In|Men|Win|Po|An|Wija|Ke|Kan|So|Sun|Nenka )
      No?
      noun
      (connector noun)*
    ;

contentWord
    : baseNoun
    | baseVerb 
    | baseModifier
    ;

expandedWord
    : ( pronoun
      | relativeQuantity
      | nominalQuantity
      | contentWord
      | ProperNoun )
    ;


pronoun
    : Ja
    | Ka
    | Mi
    | Na
    | Ne
    | Sa
    | Tu
    | Usen
    ;


contentParticles
    : We No? ( Mu No? )?
    | Mu No? ( We No? )?
    ;

baseVerb: contentParticles? rawVerbs ;

rawVerbs
    : Pese
    | Kilima
    | Iman
    | Tasuwi
    | Ukun
    | Kisa
    | Kela
    | Lika
    | Tisilin
    | Kota
    | Pi
    | Anan
    | Tenkin
    | Papon
    | Junja
    | Nan
    | Ju
    | Kanisa
    | Pela
    | Tun
    | Oke
    | Pesuwan
    | Ato
    | Wisan
    | Kun
    | Teka
    | Tijante
    | Niwa
    | Sitija
    | Makan
    | Sapole
    | Suki
    | Apijo
    | Alu
    | Kosan
    | Inkatan
    | Pen
    | Iwe
    | Putun
    | Tajen
    | Pa
    | Tene
    | Jon
    | Peman
    | Jatan
    | Lansa
    | Sapi
    | Pata
    | Akala
    | Amo
    | Kanta
    | Posa
    | Anta
    | Takuwa
    | Tawapu
    | Kalan
    | Kontatu
    | Pon
    | Teneme
    | Solu
    | Onton
    ;

baseNoun: contentParticles? rawNouns ;

rawNouns
    : Kapaja
    | Sito
    | Sala
    | Talika
    | Mata
    | Mita
    | Jasa
    | Jamin
    | Apaki
    | Luwa
    | Otota
    | Oti
    | Pani
    | Sikin
    | Sinsi
    | Anpipi
    | Ten
    | Pulusi
    | Muwesi
    | Moto
    | Kemika
    | Mani
    | Sin
    | Tolu
    | Lipu
    | Osa
    | Ken
    | Lan
    | Soto
    | Nin
    | Toki
    | Kumi
    | Polan
    | Mijalo
    | Tawe
    | Kiju
    | Jone
    | Akoli
    | Lana
    | Wa
    | Tanwa
    | Tipa
    | Pite
    | Pintu
    | Laki
    | Jan
    | Keke
    | Latito
    | Ankolo
    | Poloko
    | Komo
    | Powele
    | Sopa
    | Niku
    | Musi
    | Kaki
    | Akasa
    | Kumon
    | Namu
    | Tuwi
    | Alijun
    | Malo
    | Leseka
    | Pintan
    | Kuwan
    | Sintuwan
    | Pansin
    | Kuwosi
    | Limijen
    | Matuwa
    | Kali
    | Namuna
    | Onja
    | Ukama
    | Koton
    | Mitin
    | Konpute
    | Kuku
    | Meja
    | Momu
    | Neje
    | Pawo
    | Ukiki
    | Lenka
    | Pelete
    | Pitijo
    | Pumi
    | Matija
    | Waju
    | Salila
    | Sila
    | Ko
    | Suwina
    | Ipuwe
    | Muku
    | Kalawa
    | Wala
    | Asete
    | Kenelo
    | Onko
    | Umo
    | Lanki
    | Titi
    | Tapala
    | Talili
    | Takilo
    | Ulokan
    | Watan
    | Titan
    | Tamaka
    | Non
    | Ewin
    | Enteken
    | Menwa
    | Insu
    | Ikama
    | Inpali
    ;

baseModifier: contentParticles? rawModifiers ;

rawModifiers
    : Lijule
    | Akiki
    | Aja
    | Kapan
    | Mutakin
    | Konpa
    | Janlu
    | Jamu
    | Pututi
    | Minuli
    | Unitu
    | Loso
    | Kima
    | Patun
    | Panli
    | Tunti
    | Wanku
    | Unsi
    | Puka
    | Pankosi
    | Otan
    | Kujo
    | Ela
    | Suwi
    | Tati
    | Tomiwa
    | Tepu
    | Anwije
    | Lisi
    | Eme
    | Kapu
    | Neso
    | Kaso
    | Konen
    | Kikuwa
    | Mamaki
    | Wiki
    | Naki
    | Sone
    | Katin
    | Kula
    | Kusa
    | Tile
    | Tusa
    | Nankin
    | Nalan
    | Pasan
    | Pula
    | Mepu
    | Luka
    | Wita
    | Saminta
    | Sanpanti
    | Saman
    | Satalan
    | Sula
    | Matiko
    | Nelo
    | Kate
    | Osole
    | Umami
    | Juka
    | Tenti
    | Kawa
    | Penpe
    | Tuko
    | Olon
    | Kuto
    | Asa
    | Kijata
    | Sena
    | Sipa
    | Si
    | Joli
    | Tonsa
    | Kuwanko
    | Timi
    | Tunpu
    | Taka
    | Tune
    | Nile
    | Panta
    | Tonko
    | Sunkan
    | Lito
    | Lamo
    | Aluko
    | Nepa
    | Tutu
    | Wonpa
    | Napa
    | Nase
    | Kisowa
    | Pasu
    | Opotu
    | Uta
    | Maku
    | Tula
    | Samo
    | Tenja
    | Konje
    | Sekano
    | Pikante
    | Lipan
    | Lunti
    | Mulu
    | Wili
    | Iputu
    | Tina
    | Len
    | Santi
    | Sankan
    | One
    | Tanu
    | Sepo
    | Tope
    | Tuntan
    | Muntu
    | Kikolo
    | Lo
    | Tiku
    ;

connector
    : Tan
    | Un
    | Lekin
    | Ili
    ;

relativeQuantity
    : Jati
    | Mese
    | Menu
    | Niju
    | Ani
    ;

nominalQuantity
    : Nula
    | Wan
    | Toso
    | San
    | Lijo
    | Lima
    | Saka
    | Setan
    | Etu
    | Nanku
    | Sijen
    | Tiju
    ;
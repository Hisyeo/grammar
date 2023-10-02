parser grammar KokanuParser;

options {
    tokenVocab=KokanuLexer;
}

sentences
    : sentence (Period sentence)* Period
    ;


sentence
    : sentenceClause
    | O contentWord
      ( prepPhrase
      | modifierClause+ )*
    ;

sentenceClause
    : prepPhrase?
      ( nounPhrase ( connector nounPhrase )* )*
      prepPhrase?
      (Le verbPhrase)+
      prepPhrase?
    ;

nounPhrase
    : ( quantityPhrase? nounClause terminator modifierClause*
      | quantityPhrase? expandedWord modifierClause* )
    ;

nounClause
    : Te contentWord modifierClause* prepPhrase*
    ;

modifierClause
    : <assoc=right> Je
      ( expandedWord modifierClause*
      | sameAgentAdjClause
      | newAgentAdjClause )
    | Wo
      ( expandedWord modifierClause*
      | sameAgentAdjClause
      | newAgentAdjClause )
    | ( expandedWord
      | sameAgentAdjClause
      | newAgentAdjClause )
    ;

newAgentAdjClause
    : Ta sentenceClause 
    ;

sameAgentAdjClause
    : Te verbPhrase prepPhrase*
    ;

terminator
    : Comma
    | Period
    | EOF
    ;


verbPhrase
    : contentWord modifierClause*
    ;


quantityPhrase
    : relativeQuantity? nominalQuantity+ 
    ;


prepPhrase
    : prepClause (Comma? prepClause)*
    ;

prepClause
    : ( In|Men|Win|Po|An|Wija|Ke|Kan|So|Sun|Nenka )
      nounPhrase
      (connector nounPhrase)*
    ;

contentWord
    : baseNoun
    | baseVerb 
    | baseModifier
    ;

expandedWord
    : pronoun
    | relativeQuantity
    | nominalQuantity
    | contentWord
    ;

baseVerb
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

baseNoun
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

baseModifier
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
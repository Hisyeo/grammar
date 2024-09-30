parser grammar HisyeoParser;

options {
    tokenVocab=HisyeoLexer;
}

sentences
    : sentence (Period sentence)* Period?
    ;

sentence
    : freeAgentConstituent constituent* ( connector sentence )* postposition?
    | constituent+ ( connector sentence )* postposition?
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
    : (Xe|Vos) sentence
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

prepParticle
    : U|Ole|Hon|Oxon|Hoi|Vio|Mut|Ovek|Sun|Pi|Nenko|Oldis|Den|Lon|Gitno
    ;

postposition
    : Loicok|Voxo|Ko|Ci|Lotven|Ze
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


pronoun
    : Ozuul
    | Ono
    | Ovo
    | Ulyo
    | Cizi
    | Dizel
    | Zik
    | Noyo
    | Nu
    | Nimu
    | Ni
    | Niun
    ;


contentParticles
    : (In|Des) (Oni|Voko|Kon)?
    | (Oni|Voko|Kon) (In|Des)?
    ;

baseVerb: contentParticles? rawVerbs ;

verbMarker
    : Koi
    | Pit
    | Kuu
    | Ke
    ;

verbModifier
    : Yok
    | Eo
    | Si
    ;

rawVerbs
    : Outo
    | Okot
    | Okulo
    | Ogolol
    | Opulu
    | Onkonu
    | Onkuol
    | Oncemon
    | Ondo
    | Oitun
    | Onton
    | Icwon
    | Isko
    | Imon
    | Uskivo
    | Unon
    | Uslek
    | Unhilun
    | Hopiyo
    | Hovo
    | Hodoku
    | Helgo
    | Hevin
    | Huke
    | Hukun
    | Kontol
    | Koto
    | Koson
    | Kontesto
    | Kondodu
    | Kelo
    | Kiso
    | Kududo
    | Gomi
    | Goniso
    | Golo
    | Golun
    | Gocidon
    | Guvio
    | Guwolo
    | Touyen
    | Toswil
    | Tenkin
    | Tuluti
    | Tuek
    | Tuu
    | Tulokon
    | Conwepo
    | Couvon
    | Cixin
    | Civu
    | Cihun
    | Citse
    | Cukto
    | Cutne
    | Cuncion
    | Cunliu
    | Culono
    | Cudo
    | Cungo
    | Culosun
    | Socok
    | Sopole
    | Sopis
    | Somo
    | Solu
    | Seloho
    | Sityo
    | Siuvo
    | Suoxic
    | Suko
    | Xokulu
    | Xopo
    | Xontun
    | Xevizec
    | Xiuvu
    | Xiwon
    | Xusten
    | Doicel
    | Doho
    | Dodou
    | Dostoc
    | Deko
    | Denemek
    | Di
    | Diyonde
    | Duuhon
    | Dustu
    | Dupono
    | Dungo
    | Zohit
    | Zicou
    | Zuwopu
    | Zuto
    | Zuyi
    | Poivon
    | Pokovoc
    | Poklon
    | Posol
    | Pon
    | Petido
    | Pesol
    | Pelexu
    | Peudo
    | Pesnehot
    | Pemon
    | Piek
    | Pucono
    | Puswen
    | Punyentoc
    | Vohoso
    | Volun
    | Visun
    | Viyuxit
    | Vizi
    | Vulkoi
    | Vutsun
    | Vunpo
    | Mokon
    | Motsi
    | Monodo
    | Motsile
    | Moniso
    | Muncoti
    | Nocido
    | Niwos
    | Niltugu
    | Wovok
    | Wedo
    | Weilun
    | Weko
    | Wekeso
    | Wetodu
    | Wetu
    | Weloi
    | Lopotol
    | Lozic
    | Liun
    | Luvono
    | Lunsol
    | Yosten
    | Yon
    | Yundou
    | Yupik
    | Yunlon
    | Yunyou
    ;

baseNoun: contentParticles? rawNouns ;

rawNouns
    : Oudi
    | Okoxu
    | Oksun
    | Oklumun
    | Ocuo
    | Ostok
    | Opoki
    | Opo
    | Onomu
    | Ongolo
    | Onvipi
    | Onwoni
    | Ocoto
    | Osti
    | Ozil
    | Ongo
    | Eloi
    | Eleke
    | Etso
    | Epol
    | Enkomon
    | Enpukun
    | Itihos
    | Istihol
    | Isenso
    | Isipo
    | Isponxu
    | Ixolo
    | Ipuwe
    | Inpoli
    | Ile
    | Umo
    | Undovol
    | Unpu
    | Ucumi
    | Usen
    | Usmon
    | Unvuno
    | Ulonvu
    | Ulogun
    | Ulzo
    | Hokoli
    | Hosoun
    | Hoxope
    | Hondon
    | Hoktun
    | Hovezi
    | Honcou
    | Honyo
    | Holuk
    | Holmo
    | Henelo
    | Hitsu
    | Hiskunco
    | Hustun
    | Huzon
    | Hunsuon
    | Huwu
    | Huwuncul
    | Hulodek
    | Hulu
    | Kolowo
    | Kokoku
    | Kotvusu
    | Kosmo
    | Komu
    | Kolmudul
    | Kelos
    | Kistose
    | Kiungo
    | Kisko
    | Kino
    | Kinyosel
    | Kuunme
    | Kukwon
    | Kuon
    | Kuocyo
    | Kuoxi
    | Kusowi
    | Kudu
    | Kumun
    | Kunonti
    | Kunhiun
    | Kungiyo
    | Kuncien
    | Kunpi
    | Kulunun
    | Kuldu
    | Gos
    | Gongoxi
    | Gonpu
    | Goyu
    | Geko
    | Gito
    | Gisgul
    | Guvuyo
    | Gundole
    | Guexo
    | Gueyu
    | Gudolo
    | Guvoxe
    | Gumi
    | Gulu
    | Tohilok
    | Tonpokcut
    | Towe
    | Tolen
    | Toliyo
    | Toliko
    | Tolxeto
    | Toxutsi
    | Tomos
    | Tetek
    | Titon
    | Tixo
    | Timiok
    | Tupo
    | Tulono
    | Cokwoli
    | Comen
    | Conoi
    | Cocko
    | Ceo
    | Cen
    | Cino
    | Cingi
    | Cikinil
    | Cigilsu
    | Cipon
    | Cuonwun
    | Cui
    | Cundol
    | Culul
    | Culci
    | Sokovu
    | Sotnin
    | Soden
    | Solilo
    | Sohouk
    | Sotun
    | Sopo
    | Seki
    | Sekiton
    | Sedu
    | Semoi
    | Sel
    | Siskin
    | Sinsi
    | Sieto
    | Sikot
    | Sikin
    | Sintokmo
    | Suhot
    | Sukyunik
    | Suvoun
    | Sundipot
    | Sutuo
    | Suson
    | Sunpidu
    | Xohovec
    | Xovo
    | Xolu
    | Xomutlo
    | Xemetsen
    | Xingo
    | Xiulo
    | Xixulko
    | Ximol
    | Ximu
    | Xincuon
    | Xuk
    | Xuto
    | Xuxok
    | Doi
    | Doinpi
    | Docui
    | Donus
    | Donuxin
    | Deku
    | Detoi
    | Dipo
    | Dinci
    | Dinzou
    | Dumoko
    | Duwoni
    | Duuncit
    | Dulusi
    | Zoso
    | Zoston
    | Zomo
    | Zomi
    | Zonwul
    | Zowo
    | Zoloni
    | Zoli
    | Zohun
    | Zogoc
    | Zesto
    | Zizime
    | Zinkon
    | Zixitu
    | Ziziyo
    | Zuko
    | Zuspot
    | Zuhu
    | Zungo
    | Zuntulu
    | Zunlo
    | Poholon
    | Pogo
    | Postovis
    | Poxo
    | Popoun
    | Polce
    | Pokpun
    | Ponti
    | Polvele
    | Peiku
    | Pelete
    | Pitun
    | Pindu
    | Pinleo
    | Piomu
    | Pinton
    | Puswelin
    | Puyencok
    | Pudogo
    | Pumi
    | Puntut
    | Punduki
    | Vout
    | Vonolon
    | Vonxin
    | Volo
    | Vohon
    | Vodoloc
    | Vecko
    | Venuo
    | Vikwun
    | Vin
    | Vilo
    | Vun
    | Vuongok
    | Vuus
    | Vukuci
    | Vuxupin
    | Motuo
    | Mocko
    | Mozun
    | Mongo
    | Mokovo
    | Motowo
    | Moto
    | Motivo
    | Menyuu
    | Minyoto
    | Minyo
    | Miencok
    | Miepil
    | Mikdol
    | Mitmo
    | Micin
    | Mutyu
    | Muni
    | Muesi
    | Muhoyon
    | Mukonun
    | Muxi
    | Noo
    | Nouku
    | Noso
    | Nosiko
    | Nodu
    | Nozi
    | Nomu
    | Non
    | Nonto
    | Noilu
    | Nokso
    | Neigin
    | Nec
    | Nicu
    | Nixin
    | Nilol
    | Nukulo
    | Nucoto
    | Numuno
    | Nuluhu
    | Nuyo
    | Wokut
    | Wokto
    | Wopi
    | Wowoe
    | Woloko
    | Woyu
    | Wolik
    | Wexon
    | Wikse
    | Wixonu
    | Wik
    | Wipolo
    | Wiluwo
    | Wuto
    | Wutun
    | Wulus
    | Wuot
    | Lozo
    | Lozido
    | Lono
    | Longi
    | Lolu
    | Lonkin
    | Leknek
    | Lexetko
    | Lisik
    | Listo
    | Lismu
    | Lipu
    | Limien
    | Luhu
    | Luok
    | Luicu
    | Lucku
    | Yokuntik
    | Yogo
    | Yoskinyo
    | Yovuk
    | Youxin
    | Yocno
    | Yone
    | Yinyunci
    | Yukwoi
    ;

baseModifier: contentParticles? rawModifiers ;

rawModifiers
    : Oksios
    | Otos
    | Osyen
    | Opunyun
    | Ovine
    | Omulto
    | Oltu
    | Osole
    | Odon
    | Opok
    | Elentet
    | Evun
    | Eme
    | Eleo
    | Ispulyol
    | Invultin
    | Iwote
    | Ipudu
    | Ilxizuk
    | Uklo
    | Usundul
    | Upolni
    | Uvulit
    | Unpol
    | Utok
    | Usowo
    | Umomi
    | Unidu
    | Uncoi
    | Ulkevi
    | Ulgukin
    | Hoos
    | Hokiki
    | Hokuxi
    | Hosin
    | Homus
    | Hondot
    | Hoyo
    | Henonde
    | Helxun
    | Hiklihos
    | Hitnodet
    | Hizon
    | Hiyoli
    | Huluko
    | Huunhu
    | Hudul
    | Hunsik
    | Kotonhon
    | Kocko
    | Koput
    | Konxo
    | Konpokpo
    | Konwo
    | Kotikol
    | Koxente
    | Kodus
    | Konen
    | Kondonse
    | Konpo
    | Konyec
    | Keskin
    | Kexik
    | Kiluku
    | Kioso
    | Kiunlik
    | Kikolo
    | Kinoxi
    | Kildo
    | Kutin
    | Kuonxun
    | Kuzou
    | Kuyo
    | Gosil
    | Golvon
    | Gonzil
    | Golpinus
    | Go
    | Gonyumon
    | Gowo
    | Goluo
    | Gemolen
    | Gelmis
    | Guvis
    | Guso
    | Gunokol
    | Gulopi
    | Totsi
    | Tocit
    | Tonko
    | Tolki
    | Tigoyo
    | Tivulci
    | Tikel
    | Tiku
    | Tut
    | Tunci
    | Cok
    | Cokyen
    | Cosni
    | Conzodo
    | Colot
    | Cot
    | Comel
    | Centik
    | Cenci
    | Cenpo
    | Civulo
    | Cinopu
    | Cies
    | Cienxin
    | Cinzon
    | Cinmi
    | Cunyu
    | Cuti
    | Cuxien
    | Cupu
    | Cunvu
    | Sohou
    | Sodolun
    | Sodilu
    | Sopuni
    | Sovin
    | Sonkon
    | Sonti
    | Sonsus
    | Sondonos
    | Soltustik
    | Senzo
    | Selpo
    | Sinexis
    | Sumon
    | Sunpulno
    | Sunyotni
    | Supol
    | Sunkon
    | Suwit
    | Xoinpo
    | Xopek
    | Xonluk
    | Xowose
    | Xolxili
    | Xopoi
    | Xon
    | Xecinoc
    | Xentil
    | Xiko
    | Xisu
    | Xidetli
    | Xiyocu
    | Xulmindo
    | Dohil
    | Dode
    | Dondun
    | Dokcon
    | Didozu
    | Dile
    | Dukwelit
    | Dusul
    | Dundon
    | Zomuni
    | Zonupi
    | Zoi
    | Zelen
    | Zensi
    | Zigil
    | Zingu
    | Zilyois
    | Potuk
    | Potyoto
    | Podi
    | Pomoge
    | Pono
    | Pongosi
    | Polimot
    | Poyok
    | Polute
    | Pelisis
    | Pesu
    | Pislon
    | Pilit
    | Pikonte
    | Picuon
    | Pis
    | Pipok
    | Pinhun
    | Pilus
    | Puku
    | Put
    | Punxin
    | Pundu
    | Puihi
    | Pugot
    | Pusin
    | Puslu
    | Pudiko
    | Pulo
    | Vonmot
    | Volton
    | Volni
    | Velkono
    | Velcin
    | Vildonpun
    | Viki
    | Vitikos
    | Vicwo
    | Vixes
    | Vimosyos
    | Vunsut
    | Vunlit
    | Moskul
    | Moxo
    | Moziko
    | Momoki
    | Montuksol
    | Mokuon
    | Mocipo
    | Movi
    | Monpili
    | Mevus
    | Menekxe
    | Metlios
    | Meduson
    | Mixovo
    | Mihuon
    | Miteten
    | Muilo
    | Muun
    | Mukno
    | Mustokin
    | Muveu
    | Muncu
    | Mulu
    | Nokdo
    | Nexe
    | Nepu
    | Nendol
    | Neos
    | Nexodi
    | Nelo
    | Niok
    | Niecni
    | Nupuso
    | Nungo
    | Nulun
    | Nulto
    | Wohi
    | Wodino
    | Wonkuk
    | Welto
    | Winit
    | Wili
    | Wuktomu
    | Lohot
    | Losol
    | Londuluk
    | Lo
    | Legevu
    | Len
    | Levotol
    | Lionxin
    | Liule
    | Lito
    | Litiwe
    | Lis
    | Luko
    | Lucik
    | Lunti
    | Youmok
    | Yope
    | Yonlus
    | Youli
    | Yinsuk
    | Yumon
    ;

connector
    : En
    | Un
    | Pine
    | Lekin
    | Yodo
    ;

relativeQuantity
    : Otikon
    | Eswen
    | Eto
    | Ilik
    | Cihou
    | Xokon
    | Zotesto
    | Puzok
    | Velcin
    | Moi
    | Menus
    | Youti
    ;

nominalQuantity
    : Onsu
    | Kinse
    | Kut
    | Tou
    | Telo
    | Tiu
    | Eson
    | Tukwos
    | Elvu
    | Vun
    | Son
    | Ses
    | Xeti
    | Xunyu
    | Dus
    | Dui
    | Ziyon
    | Pole
    | Viyen
    | Nonku
    ;
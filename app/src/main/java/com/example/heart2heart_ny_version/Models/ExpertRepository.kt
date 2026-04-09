package com.example.heart2heart_ny_version.Models

import com.example.heart2heart_ny_version.R

object ExpertRepository {
    val experts = listOf(
        Expert(
            id = "puk_damsgard",
            name = "Puk Damsgård",
            description = "Journalist og forfatter med stor erfaring i menneskelige skæbner og resiliens.",
            imageRes = R.drawable.puk_damsgard,
            questions = listOf(
                Question(
                    "p1", "Mod i svære tider",
                    "Hvordan finder man mod til at fortsætte, når alt omkring en føles usikkert?",
                    "Anonym, 28 år",
                    "Mod handler ikke om fravær af frygt, men om at handle på trods af den. Se på de små sejre i hverdagen og husk, at vi mennesker er utroligt modstandsdygtige.",
                    "Mental styrke"
                ),
                Question(
                    "p2", "At lytte til andre",
                    "Jeg vil gerne blive bedre til at forstå folk, jeg er uenig med. Hvad er dit råd?",
                    "Maria, 34 år",
                    "Stil åbne spørgsmål og vær oprigtigt nysgerrig på deres 'hvorfor'. Verden bliver mindre skræmmende, når vi tør lytte til de historier, der ligger bag facaden.",
                    "Relationer"
                ),
                Question(
                    "p3", "Håndtering af frygt",
                    "Verden føles voldsom i nyhederne. Hvordan passer man på sig selv?",
                    "Sofie, 22 år",
                    "Det er vigtigt at holde pauser fra nyhedsstrømmen. Ret fokus mod det nære – dine venner, din familie og de ting, du rent faktisk kan påvirke.",
                    "Velvære"
                ),
                Question(
                    "p4", "Livets store valg",
                    "Jeg står over for en stor beslutning og er bange for at vælge forkert.",
                    "Julie, 30 år",
                    "Der findes sjældent én 'rigtig' vej. Hver vej fører til nye erfaringer. Stol på din mavefornemmelse, og vid at du kan navigere, uanset hvor du lander.",
                    "Livsvalg"
                ),
                Question(
                    "p5", "Meningsfuldhed",
                    "Hvordan finder man mening i en travl hverdag?",
                    "Lotte, 40 år",
                    "Meningen findes ofte i forbindelsen til andre mennesker. Et lille øjebliks nærvær kan give mere mening end en hel dags præstationer.",
                    "Livsvisdom"
                )
            )
        ),
        Expert(
            id = "oprah",
            name = "Oprah",
            description = "Ekspert i personlig udvikling og selvværd",
            imageRes = R.drawable.oprah,
            questions = listOf(
                Question(
                    "q1", "Ensomhed i 20'erne",
                    "Jeg struggler meget med ensomhed. Efter jeg blev uddannet, har jeg ikke meget kontakt med andre...",
                    "Anonym, 25 år",
                    "Du er ikke alene. Mange oplever ensomhed efter store livsændringer. Det betyder ikke, at der er noget galt med dig – det betyder bare, at du er i en overgang.",
                    "Relationer"
                ),
                Question(
                    "q2", "At finde sin mening",
                    "Jeg ved ikke hvad jeg vil med mit liv. Alle andre virker til at have en plan.",
                    "Sarah, 22 år",
                    "Din vej er unik. Stop med at sammenligne dit 'bag scenen' med andres 'highlights'. Din mening findes i de ting, der gør dig nysgerrig.",
                    "Selvudvikling"
                ),
                Question(
                    "q3", "Tilgivelse",
                    "Hvordan tilgiver jeg nogen, der aldrig har sagt undskyld?",
                    "Mette, 30 år",
                    "Tilgivelse er ikke noget du gør for dem, det er noget du gør for dig selv, så du kan slippe byrden og komme videre.",
                    "Mental sundhed"
                ),
                Question(
                    "q4", "Selvværd",
                    "Jeg føler mig aldrig god nok, uanset hvad jeg opnår.",
                    "Julie, 28 år",
                    "Du er nok, præcis som du er. Din værdi måles ikke i præstationer, men i din blotte eksistens.",
                    "Selvværd"
                ),
                Question(
                    "q5", "Grænser",
                    "Jeg har svært ved at sige nej til min familie.",
                    "Louise, 26 år",
                    "Et 'nej' til andre er ofte et 'ja' til dig selv. Grænser er en kærlighedserklæring til dit eget velvære.",
                    "Relationer"
                )
            )
        ),
        Expert(
            id = "linda_p",
            name = "Linda P",
            description = "Med masser livserfaring hjælper Linda med alt fra hverdagsdilemmaer til store livsspørgsmål.",
            imageRes = R.drawable.linda_p,
            questions = listOf(
                Question(
                    "q1", "Date-katastrofer",
                    "Jeg har været på 10 dårlige dates i træk. Skal jeg bare give op?",
                    "Single-pigen, 29 år",
                    "Hør her, 10 dates er ingenting! Se det som god comedy-research. Den rigtige dukker op, når du mindst venter det (og nok ser mest herrens ud).",
                    "Dating"
                ),
                Question(
                    "q2", "Akavede situationer",
                    "Jeg kom til at sende en besked OM min chef TIL min chef...",
                    "Den uheldige, 24 år",
                    "Av! Men ved du hvad? Det sker for de bedste. Eje det, grin af det, og find måske et nyt job hvis det var rigtig slemt.",
                    "Arbejdsliv"
                ),
                Question(
                    "q3", "Venskab og penge",
                    "Min veninde skylder mig 500 kr. og 'glemmer' det altid.",
                    "Låneren, 27 år",
                    "Vær direkte! Sig: 'Hey, de 500 bobs ville pynte på min konto'. Hvis venskabet ikke kan holde til det, er det ikke 500 kr. værd.",
                    "Relationer"
                ),
                Question(
                    "q4", "Kropspositivitet",
                    "Jeg hader at gå i badetøj på stranden.",
                    "Sommer-nervøs, 31 år",
                    "Skat, alle andre har travlt med at tænke på deres egne deller. Hop i vandet og nyd det – livet er for kort til at svede i en t-shirt.",
                    "Selvtillid"
                ),
                Question(
                    "q5", "Voksenlivet",
                    "Hvornår føler man sig egentlig som en voksen?",
                    "Forvirret, 25 år",
                    "Aldrig. Vi lader bare alle sammen som om. Velkommen i klubben!",
                    "Livsstil"
                )
            )
        ),
        Expert(
            id = "sofie_linde",
            name = "Sofie Linde",
            description = "Ekspert i moderskab, selvtillid og at turde være sig selv.",
            imageRes = R.drawable.sofie_linde,
            questions = listOf(
                Question(
                    "q1", "Perfekthedskultur",
                    "Jeg føler et enormt pres for at se perfekt ud på Instagram.",
                    "Instagram-offer, 19 år",
                    "Instagram er et glansbillede! Vis det rod, der er i dit liv også. Det er det, folk rent faktisk kan spejle sig i.",
                    "Sociale Medier"
                ),
                Question(
                    "q2", "At turde sige fra",
                    "Jeg tør ikke sige min mening til møder på arbejdet.",
                    "Den stille, 26 år",
                    "Din stemme er vigtig! Start med de små ting. Verden har brug for at høre, hvad du tænker.",
                    "Karriere"
                ),
                Question(
                    "q3", "Moderskab og karriere",
                    "Jeg har dårlig samvittighed over at arbejde meget, mens jeg har små børn.",
                    "Arbejdende mor, 32 år",
                    "Smid den dårlige samvittighed ud! Du er en fantastisk rollemodel for dine børn ved at vise dem, at man kan have passioner.",
                    "Familieliv"
                ),
                Question(
                    "q4", "Selvværd efter brud",
                    "Jeg føler mig helt tom efter min kæreste gik fra mig.",
                    "Hjerteknust, 23 år",
                    "Det gør ondt nu, men du er hel i dig selv. Brug tiden på at genfinde alt det, DU elsker.",
                    "Kærlighed"
                ),
                Question(
                    "q5", "At være 'for meget'",
                    "Folk siger tit, jeg fylder for meget.",
                    "Den højlydte, 21 år",
                    "Fyld det hele! Lad aldrig andre gøre dig mindre, bare fordi de ikke kan håndtere din energi.",
                    "Personlighed"
                )
            )
        ),
        Expert(
            id = "hella_joof",
            name = "Hella Joof",
            description = "Ekspert i kærlighed, livsglæde og de små mirakler i hverdagen.",
            imageRes = R.drawable.hella_joof,
            questions = listOf(
                Question(
                    "q1", "Glimmer på hverdagen",
                    "Alt føles gråt og ensformigt lige nu.",
                    "Hverdagstræt, 35 år",
                    "Husk at drysse glimmer på! Find én lille ting hver dag, der er smuk. En kop kaffe, en blomst, en god sang.",
                    "Livsglæde"
                ),
                Question(
                    "q2", "Kærlighed i 30'erne",
                    "Er det for sent at finde den store kærlighed?",
                    "Håbefuld, 38 år",
                    "Det er aldrig for sent! Kærligheden kommer, når man har åbnet døren og ryddet lidt op i gangen.",
                    "Kærlighed"
                ),
                Question(
                    "q3", "Manifestation",
                    "Tror du virkelig på, at man kan ønske sig ting fra universet?",
                    "Skeptikeren, 28 år",
                    "Ja! Men man skal også selv gå hen mod det, man ønsker sig. Universet hjælper dem, der tør drømme stort.",
                    "Spiritualitet"
                ),
                Question(
                    "q4", "Venskaber der falmer",
                    "Min bedste veninde og jeg er vokset fra hinanden.",
                    "Trist veninde, 30 år",
                    "Nogle venskaber er som årstider. Tak for sommeren, og giv plads til at et nyt kapitel kan starte.",
                    "Relationer"
                ),
                Question(
                    "q5", "At finde ro",
                    "Min hjerne kører i selvsving hver nat.",
                    "Tankemylder, 26 år",
                    "Skriv det ned, læg det i en skuffe, og sig til dig selv: 'Det tager vi os af i morgen'. Nu skal der soves.",
                    "Mental sundhed"
                )
            )
        ),
        Expert(
            id = "michelle_obama",
            name = "Michelle Obama",
            description = "Inspiration inden for lederskab, uddannelse og personlig styrke.",
            imageRes = R.drawable.michelle_obama,
            questions = listOf(
                Question(
                    "q1", "Imposter Syndrome",
                    "Jeg føler tit, at jeg ikke hører til i de rum, jeg er i.",
                    "Studerende, 22 år",
                    "Jeg har været i de rum, og tro mig: De er ikke klogere end dig. Du har fortjent din plads ved bordet.",
                    "Selvværd"
                ),
                Question(
                    "q2", "Balance",
                    "Hvordan balancerer man store drømme med hverdagens pligter?",
                    "Ambitiøs, 29 år",
                    "Det handler ikke om balance, men om prioritering. Pas på dig selv først, så du har energi til at kæmpe.",
                    "Karriere"
                ),
                Question(
                    "q3", "Uddannelse",
                    "Er det det værd at læse videre, når gælden bare vokser?",
                    "Bekymret, 21 år",
                    "Uddannelse er den kraftigste investering, du kan lave i dig selv. Den kan ingen tage fra dig.",
                    "Uddannelse"
                ),
                Question(
                    "q4", "At finde sin stemme",
                    "Jeg er bange for at tale foran mange mennesker.",
                    "Genert, 25 år",
                    "Øvelse gør mester. Din historie er vigtig, og verden har brug for at høre din unikke vinkel.",
                    "Lederskab"
                ),
                Question(
                    "q5", "Resiliens",
                    "Hvordan kommer man videre efter et stort nederlag?",
                    "Modløs, 31 år",
                    "Nederlag er bare data. Lær af det, børst støvet af skuldrene, og prøv igen med mere viden.",
                    "Mental styrke"
                )
            )
        ),
        Expert(
            id = "renee_toft",
            name = "Renée Toft Simonsen",
            description = "Psykolog og forfatter med fokus på relationer og livets faser.",
            imageRes = R.drawable.renee_toft_simonsen,
            questions = listOf(
                Question(
                    "q1", "Parforholdets udfordringer",
                    "Vi skændes om de samme små ting hver dag.",
                    "Gift i 5 år, 34 år",
                    "Små skænderier dækker ofte over uindfriede behov. Prøv at tale om følelsen bag irritationen i stedet.",
                    "Kærlighed"
                ),
                Question(
                    "q2", "Midtvejskrise",
                    "Jeg føler mig låst i mit liv og ved ikke hvem jeg er længere.",
                    "Kvinde, 45 år",
                    "Det er en naturlig fase. Se det som en invitation til at genopfinde dig selv i livets næste halvdel.",
                    "Selvudvikling"
                ),
                Question(
                    "q3", "Bonusfamilien",
                    "Det er svært at finde min rolle som bonusmor.",
                    "Bonusmor, 32 år",
                    "Tålmodighed er nøglen. Du skal ikke erstatte nogen, du skal bare opbygge din egen unikke relation.",
                    "Familie"
                ),
                Question(
                    "q4", "Angst for fremtiden",
                    "Jeg bekymrer mig konstant om hvad der skal ske.",
                    "Bekymret, 27 år",
                    "Angst lever i fremtiden. Prøv at bringe dit fokus tilbage til din vejrtrækning og lige nu.",
                    "Mental sundhed"
                ),
                Question(
                    "q5", "Sorg",
                    "Hvornår stopper det med at gøre så ondt at have mistet?",
                    "Sørgende, 39 år",
                    "Sorg forsvinder aldrig helt, men den ændrer karakter. Den bliver en del af dig, som du lærer at bære.",
                    "Livet"
                )
            )
        ),
        Expert(
            id = "emma_holten",
            name = "Emma Holten",
            description = "Foredragsholder og debattør med fokus på feminisme og digitale rettigheder.",
            imageRes = R.drawable.emma_holten,
            questions = listOf(
                Question(
                    "q1", "Grænser online",
                    "Jeg har oplevet ubehagelige kommentarer på mine billeder.",
                    "Ung kvinde, 20 år",
                    "Det er aldrig din skyld. Du har ret til at være i det digitale rum uden at blive krænket. Blokér og anmeld.",
                    "Digitale rettigheder"
                ),
                Question(
                    "q2", "Kropspres",
                    "Jeg føler mig aldrig tynd nok eller smuk nok.",
                    "Studerende, 23 år",
                    "Vi lever i en kultur, der tjener penge på din usikkerhed. Prøv at se din krop som et redskab, ikke et objekt.",
                    "Feminisme"
                ),
                Question(
                    "q3", "Samtykke",
                    "Hvordan tager man samtalen om grænser i et nyt forhold?",
                    "Nysgerrig, 21 år",
                    "Samtykke er en løbende samtale. Det er sexet og trygt at vide, hvor man har hinanden.",
                    "Relationer"
                ),
                Question(
                    "q4", "Ligestilling i hjemmet",
                    "Jeg ender altid med at tage alt det mentale slæb derhjemme.",
                    "Partner, 28 år",
                    "Synliggør det 'usynlige' arbejde. Lav en liste og fordel opgaverne ligeligt. Det er også ligestilling.",
                    "Relationer"
                ),
                Question(
                    "q5", "Aktivisme",
                    "Hvordan kan jeg gøre en forskel i verden?",
                    "Engageret, 24 år",
                    "Start der hvor du er. Sig fra over for diskrimination i din hverdag. De små handlinger tæller.",
                    "Samfund"
                )
            )
        ),
        Expert(
            id = "maria_h",
            name = "Maria H",
            description = "Ekspert i holistisk sundhed, yoga og mental balance.",
            imageRes = R.drawable.maria_h,
            questions = listOf(
                Question(
                    "q1", "Stresshåndtering",
                    "Jeg føler mig konstant på overarbejde, både mentalt og fysisk.",
                    "Karriere-kvinde, 33 år",
                    "Din krop sender dig signaler. Lyt til dem. Start med 5 minutters dyb vejrtrækning hver morgen.",
                    "Sundhed"
                ),
                Question(
                    "q2", "Søvnproblemer",
                    "Jeg kan ikke falde til ro om aftenen.",
                    "Natugle, 26 år",
                    "Skab et aftenritual uden skærme. En varm kop te og lidt blid udstrækning kan gøre underværker.",
                    "Velvære"
                ),
                Question(
                    "q3", "Intuition",
                    "Hvordan lærer jeg at stole på min mavefornemmelse?",
                    "Tvivleren, 29 år",
                    "Maven taler lavt. Du skal skabe stilhed for at høre den. Meditation er et fantastisk værktøj til dette.",
                    "Selvudvikling"
                ),
                Question(
                    "q4", "Kost og energi",
                    "Jeg er altid træt om eftermiddagen.",
                    "Træt mor, 31 år",
                    "Kig på dit blodsukker. Prøv med mere protein og grønt til frokost, og husk at drikke nok vand.",
                    "Ernæring"
                ),
                Question(
                    "q5", "Selvkærlighed",
                    "Jeg er min egen værste kritiker.",
                    "Anonym, 24 år",
                    "Tal til dig selv, som du ville tale til din bedste veninde. Du fortjener din egen omsorg.",
                    "Mental sundhed"
                )
            )
        ),
        Expert(
            id = "iben_hjejle",
            name = "Iben Hjejle",
            description = "Skuespiller og podcaster med fokus på venskaber og det ærlige liv.",
            imageRes = R.drawable.iben_hjejle,
            questions = listOf(
                Question(
                    "q1", "Venskaber i voksenlivet",
                    "Det er svært at finde nye venner som voksen.",
                    "Flyttet til ny by, 30 år",
                    "Vær modig! Inviter en bekendt på kaffe. Venskaber kræver initiativ, især når vi bliver ældre.",
                    "Venskab"
                ),
                Question(
                    "q2", "At turde fejle",
                    "Jeg er bange for at virke dum, hvis jeg prøver noget nyt.",
                    "Den forsigtige, 27 år",
                    "Fejl er bare erfaring med et andet navn. Grin af det, og prøv igen. Det er der, vi vokser.",
                    "Selvtillid"
                ),
                Question(
                    "q3", "Alenetid",
                    "Jeg føler mig mærkelig, fordi jeg godt kan lide at være alene.",
                    "Introvert, 25 år",
                    "Det er en superkraft! At trives i eget selskab giver en enorm indre ro og styrke.",
                    "Personlighed"
                ),
                Question(
                    "q4", "Karriereskift",
                    "Jeg har lyst til at lave noget helt andet, men tør ikke.",
                    "Fastlåst, 34 år",
                    "Livet er for kort til et job, der dræner dig. Tag et lille skridt mod din drøm i dag.",
                    "Arbejde"
                ),
                Question(
                    "q5", "Ærlighed",
                    "Hvor ærlig skal man være over for sine veninder?",
                    "Tvivleren, 28 år",
                    "Ærlighed er fundamentet. Men husk altid at pakke sandheden ind i kærlighed og respekt.",
                    "Relationer"
                )
            )
        ),
        Expert(
            id = "bodil_jorgensen",
            name = "Bodil Jørgensen",
            description = "Livsvisdom, humor og nærvær fra en af Danmarks mest elskede kvinder.",
            imageRes = R.drawable.bodil_jorgensen,
            questions = listOf(
                Question(
                    "q1", "At finde ro i kaos",
                    "Verden føles så voldsom lige nu.",
                    "Bekymret mor, 40 år",
                    "Træk vejret helt ned i maven. Husk de nære ting. En god snak over hækken eller en kop kaffe i solen.",
                    "Livsvisdom"
                ),
                Question(
                    "q2", "Humor som medicin",
                    "Jeg har glemt hvordan man griner midt i alt det svære.",
                    "Trist, 32 år",
                    "Humoren er vores redningsplanke. Prøv at se det komiske i det tragiske – det gør det lidt lettere at bære.",
                    "Mental sundhed"
                ),
                Question(
                    "q3", "Nærvær",
                    "Jeg er altid på vej videre til det næste.",
                    "Stresset, 29 år",
                    "Stop op. Se på træerne, mærk jorden. Livet er det, der sker lige nu, ikke det der sker i morgen.",
                    "Mindfulness"
                ),
                Question(
                    "q4", "Generationskløfter",
                    "Jeg forstår ikke mine børns digitale verden.",
                    "Mor, 45 år",
                    "Spørg dem med nysgerrighed. De vil gerne lære dig det, hvis du viser interesse for deres verden.",
                    "Familie"
                ),
                Question(
                    "q5", "At blive ældre",
                    "Jeg er bange for at miste min relevans med alderen.",
                    "Kvinde, 38 år",
                    "Du bliver kun mere interessant med årene! Erfaring er en smuk ting, som ingen kan tage fra dig.",
                    "Livet"
                )
            )
        )
    )
}

**https://www.w3schools.com/java/**
#Tema: Objektorientert programmering

##Bilettsystem, oppgave 1
Det skal utformes et program for et enkelt køsystem for et apotek. Køsystemet skal fungere slik at den som har ventet lengst skal få hjelp først. Kunder som har fått hjelp skal fjernes fra køen.

Når koden er ferdig skal det skrives tester for alle relevante metoder

Hver elev skal også opprette et remote repo på GitHub for prosjektet og comitte sin kode dit daglig eller oftere når det er fornuftig

Programmet skal deles i 3 klasser:

***Ticket*** - Skal ha en unikt nummer som sier når den ble trukket.

***TicketSystem*** - Skal kunne lage nye kølapper, betjene kunden som har ventet lengst og holde styr på hvor mange kunder som venter på å bli betjent. Dette skal oppnåes ved at klassen innholder en *ArrayList tickets* med objekter av typen *Ticket*.

***TicketQueue*** - Inneholder *main* og skal vise meny og utføre brukervalg:   

**MENY FOR BILLETTSYSTEM**

1. Trekk kølapp
2. Betjen kunde
3. Print kø
4. Avslutt

Der:

1. Oppretter objekt av type Ticket, skriver ut ticket informasjon og legger den til tickets
2. Henter og skriv ut informasjon om første kølapp og fjern den fra tickets listen
3. Skriver ut alle kunder i kø
4. Skriver ut 'Programmet avsluttes' og avslutter program

Ref.: *Opprette applikasjon i Intelij.pdf* på IL

**Læringsmål**

- Parprogrammering
- Opprette konsoll applikasjon
- Opprette klasser
- Opprette klasse-konstruktører
- Opprette klasse-variabler
- Opprette klasse-metoder
- Opprette klasse-forekomster
- Kalle klasse-metoder
- Kalle statiske metoder
- Forskjell på Kø og Stakk
- Opprette og betjene kø
- Opprette og utføre tester
- Opprette og oppdatere Git-repo
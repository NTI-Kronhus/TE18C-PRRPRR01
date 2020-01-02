# Datatyper
## Primitiva datatyper

Datatyp     |   Typ av data |Exempel
------------|---------|---------
int |  heltal | ``` int heltal = 6;```
double | decimaltal | ``` double d = 5.67;```
boolean | true/false | ``` boolean condition = true;```
char | tecken | ``` char c = 'N'; ```

## Icke primitiva datatyper
Datatyp     |   Typ av data |Exempel
------------|---------|---------
String |  text | ``` String namn = "Joakim"; ```


# Operatorer
## Logiska operatorer
Operator | Operation
---------|-----------
 && | och
\| \|| eller
! | inte

## Aritmetiska operatorer
Operator | Räknesätt
---------|-----------
\+ | addition
\- | subtraktion
\* | multiplikation
\/ | division
\% | modulus (rest)
\+\+ | öka med 1
\-\- | minska med 1

## Jämförelseoperatorer
Operator | Jämförelse
---------|-----------
< | mindre än 
\> | större än
== | lika med
\>= | större än eller lika med
<= | mindre än eller lika med
!= | inte lika med

# Kontrollstrukturer:
## if / else if / else
if används när du vill utföra något enbart om ett visst villkor är uppfyllt. <br>
Syntax: 
```java
if(villkor){
  // KOD ATT UTFÖRA
}
```
Exempel:
```java
int age = 23;
if( age > 15 ) {
  System.out.println("Du får köra moppe!");
}
```

else if används om du vill ha flera villkor, där den andra satsen körs om den första inte körs. <br>
Exempel:
```java
if(villkor1){
    //Gör något
}
else if(villkor2){
    //Gör något annat
}
```

else används som sista alternativ, alltså om inget av de andra villkoren uppfylls. <br>
Exempel:
```java
String direction = "right";

if( direction.equals("left")){
  go_left();
}
else{
  go_right();
}
```

Du kan ha hur många else if-satser du vill, men du måste alltid börja med en if-sats och vanliga else-satser måste ligga sist i ordningsföljden. <br>
Exempel:
```java
if(villkor1){
    //Gör en första sak
}
else if(villkor2){
    //Gör en annan sak
}
else if(villkor3){
    //Gör ett tredje alternativ
}
else{
    //Gör det sista alternativet
}
```

## for
En for-loop används vid ett KÄNT antal iterationer. <br>
Syntax:
```java
for( 1 ; 2 ; 3 ){
  // KOD ATT UTFÖRA
}
1 - startvärde
2 - villkor för att fortsätta
3 - öka/minska
```
Exempel:
``` java
int sum = 0;
for(int i = 1 ; i <= 10 ; i++){
  sum += i;
}
System.out.println(sum); // sum = 55
```

## while
En while-loop används vid ett OKÄNT antal iterationer.<br>
Syntax:
```java
while(villkor){
  // KOD ATT UTFÖRA
}
```
Exempel:
``` java
boolean solution = false;
while(!solution){
	// LETA EFTER LÖSNING
}
```

# Metoder
Metoder inom programmering kan liknas vid funktioner i matematiken. De tar (ofta) in ett värde, utför någonting (exempelvis en beräkning), och skickar (ofta) tillbaks ett värde. På en miniräknare har ni en mängd funktioner, som t.ex. sin(x), exponentiering eller grafritning. Utan dessa funktioner hade det varit svårt att över huvud taget ha användning för en miniräknare, då du som använder miniräknaren t.ex. måste kunna utföra sin-funktionens beräkningar själv, skriva x<sub>1</sub> * x<sub>2</sub> ... * x<sub>50</sub> istället för x<sup>50</sup>, eller rita grafer för hand. 

På samma sätt är metoder en stor hjälp inom programmering. Metoder är alltså ett verktyg för att spara tid, minska upprepning av kod och göra det lättare för dig som programmerare att programmera. 

##### Syntax:
I Programmering 1 räcker det att alla metoder börjar med "public static", i Programmering 2 kommer ni lära er när och varför ni ska ändra på dessa nyckelord. Efter "public static" skriver ni vilken datatyp som ska returneras, alltså skickas tillbaks dit ni anropade metoden. Ska inget värde returneras skriver ni "void". Därefter ger ni metoden ett namn, och eventuell indata innanför en parentes. Alltså: <br>

public static *datatyp* *metodNamn*(*datatyp1* *variabelnamn1*, *datatyp2* *variabelnamn2*){<br>
    //KOD<br>
}<br>

För att anropa (köra) metoden skriver ni variabelnamnet och eventuell indata innanför parentes. Alltså:<br>
*metodNamn*(*datatyp1* *variabelnamn1*, *datatyp2* *variabelnamn2*);<br>

Syntaxexempel:
```java
public static void main(String[] args){
    //Exempel på ett metod-anrop: 
    methodOne();
    
    //exempel på ett metod-anrop med indata, som sparar return-värdet i en variabel
    int dummyArgument = 5;
    int dummyVariable = methodTwo(5)
}

//Exempel på metod som inte returnerar eller tar in något värde.
public static void methodOne(){
    //KOD 
}

//Exempel på metod som tar in en int och returnerar en int.
public static int methodTwo(int dummyParameter){
    //KOD
    return intValue;
}
```

##### Exempel:
Exempel på kod som använder sig av metoder för att hälsa en spelare välkommen, och sedan kolla om spelaren uppfyller ålderskraven.
```java
public static void main(String[] args){
   Scanner in = new Scanner(System.IN);
   
   System.out.println("Please enter your name:");
   String name = in.nextLine();
   greetThePlayer(name); //Anropar metoden och skickar in namnet.
   
   System.out.println("Please enter your age:");
   int age = in.nextInt();
   //Anropar metoden, skickar in åldern och sparar return-värdet i en ny variabel.
   boolean isAllowedToPlay = ageRestrictionCheck(age); 
   
   if(isAllowedToPlay){
       startGame();
   } else {
       exitGame();
   }
}

//En metod som hälsar spelaren välkommen.
public static void greetThePlayer(String playerName){
    System.out.println("Hello " + playerName + ", welcome to the best game ever!");
}

//En metod som kollar om personen får spela spelet eller inte.
public static boolean ageRestrictionCheck(int playerAge){
    if(playerAge > 18){
        return true;
    } else {
        return false;
    }
}
```

# Arrays
En array är en lista fylld med olika värden. En array kan bara innehålla värden av *en specifik datatyp*, och längden på arrayen *måste fördefinieras*.

Klicka [HÄR](https://github.com/NTI-Kronhus/TE18C-PRRPRR01/blob/master/Lektionsgenomg%C3%A5ngar/v49/M%C3%A5ndag.java) för att se hur du använder dig av arrays.

# Övrigt

## Main-metod
En main-metod måste finnas i alla klasser som vi vill köra. <br>
En main-metod skapas enklast genom att skriva main och sedan autocomplete (CTRL + SPACE).<br>
Syntax:
```java
public static void main(String[] args){
  // DITT PROGRAM
}
```

## Scanner
En Scanner används för att läsa av användar-input från consolen.<br>
Syntax:
```java
Scanner namn = new Scanner(System.in);
```
Exempel:
```java
Scanner input = new Scanner(System.in);
int tal = input.nextInt();
String text = input.nextLine();
```

## Output
```java
System.out.println("Hello World");
```

## import
import måste alltid användas när vi använder oss utav bl.a. Scanner och andra avancerade klasser.<br>
Du får oftast ett error-meddelande om du försöker använda dig av något som inte importerats. <br>
Exempel:
```java
import java.util.Scanner;
```
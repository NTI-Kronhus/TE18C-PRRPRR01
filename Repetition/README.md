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

## Jämförelse operatorer
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
# ISO_B01_Problema1
Testing del ejercicio 3

El ejercicio 1  ha sido realizado por Guillermo Cubero y Yolanda Galvan Redondo 
Se puede encontrar el codigo +  capturas de excel con el calculo de parametros 

## Pseudocodigo Año bisiesto

Inicio

Variables: 

	día
	mes
	año
	bisiesto = true
	
Si día ← carácter o número negativo Entonces

	Lanzar Excepción
EsBisiesto () ← fecha (día, mes, año)

Si año%4 ==0 AND (año%100==0 OR año%400==0)

	Bisiesto ← true
	return bisiesto
Sino

	Bisiesto ← false
	return bisiesto
	
Fin
  
## Variables a tomar en cuenta
Pese a que solamente haga falta el año para determinar si es bisiesto o no, hemos considerado como variables de entrada el día, mes y año. El método recibe un objeto fecha como parámetro de entrada, siendo necesario que estén las tres variables introducidas correctamente.

## Valores de prueba

![image](https://user-images.githubusercontent.com/91546381/209236311-dff78b4b-02c1-46f9-bab4-76b36ceb9281.png)

## Número máximo de posibles casos de prueba:
Each use: 8. Pues es el mayor número de valores que puede adoptar una de nuestras variables (dos en nuestro caso, día y mes).
Pair-Wise: 8x8 = 64. Son las dos variables que más parámetros reciben.	
N-Wise: 6x6x4 = 144

## Conjunto de casos de pruebas para cumplir con each use
Test suite = {(-17, -5, -10), (17, 5, 2022), (71, 25, 0), (1, 1, -10), (31, 12, 2022), (-5000, 15000, -10000)}

## Conjunto de casos de pruebas para cumplir con pairwise
Los parámetros que más valores adquieren son dando día como mes con 6, por lo que el conjunto de casos de prueba de PairWise será de 6x6 = 36

![image](https://user-images.githubusercontent.com/91546381/209236946-b5ae4763-b816-447f-85be-fb39f1007ecb.png)


## Casos de prueba para alcanzar cobertura de decisiones
1º decisión: Que sea divisible entre 4 (A), entre 100 (B) y entre 400 (C).

![image](https://user-images.githubusercontent.com/91546381/209237062-e2c2ee10-a454-4b92-a8ac-342ba5ab3f6a.png)

## Cobertura Modificada

![image](https://user-images.githubusercontent.com/91546381/209237133-4805cf6f-11f8-4c88-bce6-8fdd99f453a2.png)

![image](https://user-images.githubusercontent.com/91546381/209237147-c04a7189-c173-4d6d-91e6-19a17e3260cd.png)

Para calcular si un año es bisiesto hay que tener en cuenta que el año sea divisible entre 4 y, además, divisible entre 100 pero no 400. Luego nos quedarían 3 decisiones: divisible entre 4 && (Divisible entre 100 || Divisible entre 400)


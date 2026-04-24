# TP-JAVA
StreamerStats-TP Trabajo práctico para la materia Resolución de Problemas y Algoritmos (RPA). Aplicación en Java diseñada para la gestión financiera de streamers, enfocada en la implementación de programación modular, estructuras de control condicionales y repetitivas, y el uso de acumuladores y contadores para reportes estadísticos.


Trabajo Práctico: "Streamer Stats"
Ejercicio 1.
En la plataforma de streaming "Stream Stats", los creadores de contenido necesitan gestionar sus ingresos diarios y evaluar su rendimiento semanal. El sistema debe automatizar el cálculo de ganancias e impuestos.
Para cada streamer la plataforma aplica un impuesto del 21% (IVA) sobre el total bruto diario generado por suscripciones. La ganancia neta diaria se calcula de la siguiente manera:
Ganancia = (valor de la suscripción × cantidad de suscriptores) − 21% del total bruto
ejemplo: Si el valor de la suscripción es $100 y se tienen 50 suscriptores:
Total bruto = 100 × 50 = 5000
Impuesto (21%) = 1050
Ganancia neta = 5000 − 1050 = 3950

a. Cálculo de Ingresos.  (Entrega 1)
Diseñar un módulo que reciba el valor de la suscripción mensual y la cantidad de suscriptores, calcule y devuelva el valor de la ganancia según los impuestos de la plataforma.
Diseñar un algoritmo para que cada streamer de la plataforma lea el valor de la suscripción mensual y la cantidad de suscriptores, luego invoque al módulo desarrollado anteriormente y muestre la ganancia obtenida.

b. Categorización y Bonos (Entrega 2)
Modificar el programa anterior para que el sistema pueda evaluar el rendimiento del streamer e incentivar su crecimiento. La plataforma otorgará un bono de desempeño sobre el Ingreso Neto si la cantidad de suscriptores es mayor o igual a 30 se suma un bono del 5% del Ingreso Neto al total final. Caso contrario: no se percibe bono.

c. Resumen de la "Stream-Week" (Entrega 3)
Diseñar un algoritmo principal que permita procesar los datos correspondientes a varios días de transmisión. El programa deberá solicitar al usuario la cantidad de días que desea registrar y, a partir de ese valor, repetir el proceso de carga de información diaria. En cada día se deberán ingresar el valor de la suscripción y la cantidad de suscriptores, y luego invocar el módulo de cálculo de ganancias desarrollado en entregas anteriores. Una vez finalizado el ingreso de todos los datos, el programa deberá mostrar el total de suscriptores acumulados durante todo el período, la ganancia total neta obtenida y la cantidad de días en los que se logró obtener el bono.
Requerimientos de Entrega
Uso obligatorio de módulos (funciones o procedimientos),implementación de estructuras de control condicionales (if/else) y uso de estructuras de repetición y acumuladores.

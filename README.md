# Conversor de Monedas - ONE G8 

![Static Badge](https://img.shields.io/badge/STATUS-COMPLETED-green)

## Índice
- [Descripción](#descripción--)
- [Funcionalidades](#funcionalidades--)
- [Acceso al proyecto](#acceso-al-proyecto--)
- [Tecnologías utilizadas](#tecnologías-utilizadas--)
- [Autores](#autores--)

## Descripción. - 
Programa de Java para hacer conversión de un tipo de moneda a otro, usando la API de _Exchange Rate_ para el acceso a funciones de conversion y datos actualizados de valores reales de distintos tipos de economías.  

## Funcionalidades. - 
- `Selección de Monedas a convertir`: Una vez ejecutado el programa, este mismo desde la consola permite la elección libre de los distintos tipos de moneda a los cuales se busca hacer una conversión, sin posibilidad de repetición de opciones (no es lógico convertir de MXN a MXN). 
A pesar de que es de libre elección, es eso, una elección; pues no se permite el agregado de otros formatos de moneda sin tocar el código fuente.
- `Ingreso de monto específico a convertir`: Una vez se tienen los 2 formatos de moneda a hacer la conversión, el programa permite ingresar desde la consola la entrada del monto específico de dinero a convertir.
- `Muestra de resultados de operación`: Cuando se tienen los datos necesarios, siendo los tipos de moneda y el monto específico, el programa realiza la operación usando la API de _Exchange Rate_ para lograr la conversión con datos actuales del mundo real respecto al valor de moneda en el mundo. 
Devolviendo el resultado si la operación fue exitosa por parte de la API, o mensaje de error si no se falló el proceso.
- `Manejo de respuestas erroneas del usuario`: Con la elección de opciones en la consola, se maneja la elección de manera intuitiva y flexible para el usuario repitiendo el proceso en caso de respuestas no válidas.

## Acceso al Proyecto. - 
- Descarga/clona el proyecto desde este repositorio.
- Una vez lo tengas descargado vas a necesitar descargar el archivo JAR de la librería _Gson_ para este programa (descarga desde: https://mvnrepository.com/artifact/com.google.code.gson/gson).
  - Una vez lo descargues, dentro de tu IDE tienes que agregarlo para su uso, agregando la referencia del archivo JAR en tu equipo.
- También vas a necesitar una API KEY de la API de _Exchange Rate_, puedes generar una API KEY de manera gratuita registrandote: https://www.exchangerate-api.com.
- Con tu API KEY, necesitarás generar un archivo `config.properties` dentro de la carpeta `src` del proyecto. Una vez creado, creas la variable `EXCHANGE_RATE_API_KEY` y ahí agregas tu API KEY.
- Y si has seguido los pasos hasta aquí solo quedaría ejecutar el programa desde la clase `Main` y empezar a usar este programa.

## Tecnologías utilizadas. - 
- Java 17.0.13.
- Archivo JAR de la librería _GSON_ Ver. 2.10.1.
- _Exchange Rate API_.

## Autores. - 
[<img src="https://avatars.githubusercontent.com/u/82849413?v=4" width=115><br><sub>Bryan Sigala</sub>](https://github.com/DevBryanSJ)

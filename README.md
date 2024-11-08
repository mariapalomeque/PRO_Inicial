<h1 style="display: inline;">PROYECTO INICIAL</h1> 
<img src="Recursos visuales/LogoITIC.png" width="50" style="vertical-align: middle;" />

## Introducción 

Un grupo de cinco estudiantes del Instituto TIC de Barcelona se ha unido para formar un equipo de desarrolladores con el objetivo de crear un sistema de control de fichajes para una organización. Este equipo está compuesto por **Luis Montiel** (DAW), **Aitor Santamaría** (ASIX), **Aaron Rodríguez** (ASIX), **Pau Chacón** (DAM) y **María Palomeque** (DAM).

---

### Descripción del proyecto 
El objetivo principal del proyecto es desarrollar un sistema que permita registrar de manera precisa la entrada y salida de personas en espacios específicos dentro de un edificio. Para lograr esto, se creará un dispositivo basado en Arduino que lea datos de tarjetas RFID y envíe esta información a una base de datos centralizada.

Además, se integrarán varios componentes de infraestructura para garantizar la seguridad, escalabilidad y correcto funcionamiento del sistema en un entorno simulado de empresa. Esto incluye el diseño de una base de datos que contemple los requerimientos del proyecto y posibles ampliaciones futuras, así como la planificación y despliegue de la infraestructura de servidores en la infraestructura de Isard.

Desde el servidor, se recogerán las lecturas enviadas por el dispositivo y se guardarán en la base de datos, proporcionando feedback al dispositivo para indicar posibles errores. Este proyecto no solo busca desarrollar una solución técnica efectiva, sino también proporcionar una experiencia de aprendizaje integral para los estudiantes involucrados, preparándolos para futuros desafíos en el campo de la tecnología.

---

### Planificación del Proyecto

Para este proyecto, se implementará la metodología Agile, estructurando el desarrollo en **siete sprints** que permitirán avanzar de manera organizada y adaptativa. En cada sprint se abordarán tareas específicas para completar los diferentes aspectos del proyecto. Además, se utilizará un tablero **Kanban** en la herramienta **Trello** para distribuir las tareas entre los miembros del equipo y hacer un seguimiento continuo del estado de cada una. Con el tablero Kanban, se podrá visualizar de manera clara el progreso de cada tarea en sus diferentes etapas, desde "Pendiente" hasta "En proceso" y "Finalizada".<br><br>


![alt text](<Recursos visuales/Sprints.png>)

#### Sprint 1: del 5 al 8 de noviembre
El primer sprint estará enfocado en establecer los cimientos del proyecto. Como primer paso, se realizará la lectura de datos desde una tarjeta utilizando Arduino a través del monitor serie. También, se procederá a diseñar los wireframes preliminares de la aplicación web y la aplicación móvil en Figma. Estos diseños iniciales serán cruciales para dar una visión clara de la interfaz que guiará el desarrollo visual y funcional de ambas plataformas. Todas las tareas de este sprint se registrarán en el tablero Kanban de Trello, donde cada miembro podrá asignarse responsabilidades específicas y actualizar el estado de las tareas en tiempo real.

#### Sprint 2: del 11 al 15 de noviembre
Durante el segundo sprint, se dará forma a la infraestructura tecnológica que soportará el proyecto. Esto incluye el diseño de la red y los servidores necesarios. Paralelamente, se configurará Arduino para leer datos y transmitirlos a AWS mediante dispositivos IoT, asegurando una comunicación fluida entre los dispositivos y la nube. Además, se diseñará la base de datos que se usará para gestionar el control de presencia, y se desarrollarán wireframes de alta fidelidad junto con una guía de estilos para alinear el diseño visual con la experiencia de usuario deseada. Todo el equipo podrá monitorear el progreso de estas tareas en Trello, facilitando la colaboración y evitando duplicaciones de esfuerzo.

#### Sprint 3: del 18 al 22 de noviembre
El tercer sprint estará dedicado a la implementación de la infraestructura de datos y servidores, así como al desarrollo de una API REST. Se configurará la base de datos, estableciendo roles, permisos y protocolos de comprobación de seguridad. También se desplegará la infraestructura de servidores y la red interna del proyecto, gestionando los accesos mediante usuarios SSH. Para completar este sprint, se desarrollará una aplicación cliente en Java que permitirá recibir datos de AWS y almacenarlos en la base de datos, y se comenzará a construir una API REST para gestionar la base de datos relacional, lo cual permitirá consultas de registros y usuarios en tiempo real. El tablero Kanban en Trello se usará para actualizar continuamente el estado de estas tareas y hacer un seguimiento de los hitos alcanzados.

#### Sprint 4: del 25 al 29 de noviembre
El cuarto sprint se centrará en las pruebas y en el desarrollo inicial de las aplicaciones web y móvil. Se realizará una serie de pruebas exhaustivas de la API mediante herramientas como Postman para garantizar su correcto funcionamiento. En esta etapa, también se configurará Arduino para recibir datos del servidor y proporcionar retroalimentación al usuario a través de LEDs de diferentes colores, indicando si los datos fueron recibidos correctamente (LED verde) o si hubo un error (LED rojo). Paralelamente, se avanzará en el desarrollo de la aplicación web que se conectará a la API para obtener y mostrar la información de manera intuitiva y funcional. También se iniciará el desarrollo de un prototipo funcional de la aplicación móvil. Todo el equipo podrá utilizar el Kanban para actualizar y revisar el progreso de las pruebas y el desarrollo de las aplicaciones.

#### Sprint 5: del 2 al 6 de diciembre
En el quinto sprint, se llevará a cabo el monitoreo de toda la infraestructura mediante scripts personalizados que permitan detectar y resolver problemas de forma proactiva. A su vez, se continuará con el desarrollo incremental de las aplicaciones web y móvil, consolidando funcionalidades y ajustando detalles de diseño. Los cambios y mejoras se registrarán en Trello, permitiendo a todos los miembros del equipo ver las modificaciones en tiempo real y coordinar el trabajo pendiente.

#### Sprint 6: del 9 al 13 de diciembre
Este sprint estará dedicado a la preparación de la presentación final y la documentación del proyecto. Se recopilará y organizará toda la información relevante sobre el desarrollo, arquitectura, y funcionamiento del sistema, creando una documentación completa que facilite la comprensión y uso del sistema tanto para usuarios como para futuros desarrolladores. Todo el equipo podrá hacer un seguimiento de las tareas de documentación y ver en Trello su estado, desde la redacción hasta la revisión final.

#### Sprint 7: del 16 al 19 de diciembre
Finalmente, en el séptimo sprint, se realizará la presentación del proyecto. En esta etapa, cada miembro del equipo expondrá los resultados y aprendizajes obtenidos a lo largo de los diferentes sprints, destacando cómo se han cumplido los objetivos planteados en cada fase del desarrollo.

---
<br><br>

![## Sprint 1](<Recursos visuales/Sprint 1.png>)

En el primer sprint, los estudiantes de **DAM** y **DAW** se enfocarán en definir de manera profunda la logística y estructura del programa. A pesar de que se trabajará en formatos diferentes (web y aplicación móvil), ambas versiones deberán compartir una estética coherente y estable que mantenga la consistencia visual y funcional entre ambas plataformas.

Una vez que se tenga una idea clara de cómo será nuestra aplicación, se iniciará el diseño del **wireframe de baja fidelidad**. Este primer diseño mostrará únicamente una estructura base, con las principales funciones que deberá tener la aplicación. Conforme avance el proyecto, se desarrollará un segundo diseño de la aplicación, más elaborado y concreto, que permita una visión detallada del producto final, alineada con los objetivos y funcionalidades definidas desde el inicio.

Además, pueden acceder al **Kanban** de este primer sprint a través del siguiente enlace: [Trello Kanban Sprint 1](https://trello.com/invite/b/672a306125d7db1ec30293e2/ATTIf212ea20f08c3613c9efc530832732a2DBABB5D3/a02-4-sprint-1), donde podrán seguir el progreso de las tareas asignadas. También pueden revisar el **Figma del wireframe de baja fidelidad** en este enlace: [Wireframe Proyecto - Figma](https://www.figma.com/design/LIGys4AhyOJA7BgPnojR0F/WIREFRAME-PROYECTO?node-id=2003-368&t=Af2eXti2xyl8ThtI-1). En la carpeta de **Wireframe de baja fidelidad**, podrán encontrar las imágenes de los dos wireframes desarrollados hasta el momento.


---

### Aplicación movil 

#### Inicio de sesión 

La **primera pantalla** que aparece es la de **inicio de sesión**. En esta, se nos pedirá que seleccionemos una de las tres **modalidades de usuario**: **alumno**, **profesor** o **administrador**. Una vez realizada la selección, seremos redirigidos a la pantalla de **inicio de sesión** correspondiente, donde deberemos ingresar nuestras **credenciales**: el **correo institucional** y la **contraseña**.

Las cuentas serán **creadas y gestionadas exclusivamente por el administrador** del sistema, ya que solo un grupo determinado de personas podrá tener acceso autorizado a la aplicación. Además, será necesario que cada usuario tenga su cuenta vinculada con un **chip de identificación**, asegurando así que el acceso y control de presencia sea seguro y adecuado para cada tipo de usuario.

![alt text](<WIREFRAM BAJA FIDELIDAD/Aplicación mobil/Inicio sesión.png>)

---
#### Plataforma alumno


El portal del estudiante ofrece tres funcionalidades clave para facilitar el acceso a su información académica y personal. En primer lugar, permite consultar su **horario** de clases, organizado de manera clara y estructurada, lo que le facilita planificar su jornada académica. Además, cuenta con una sección de registro de **asistencia**, en la que el estudiante puede ver detalladamente sus entradas y salidas a lo largo de la semana, obteniendo una visión completa de sus asistencias registradas en cada sesión. Por último, en la sección de *Mi perfil*, el estudiante tiene acceso a los datos de su cuenta, además de la opción de **cerrar sesión** cuando lo desee.

![alt text](<WIREFRAM BAJA FIDELIDAD/Aplicación mobil/Funcionaliades alumno.png>)

---

#### Plataforma profesor

La **plataforma del profesorado** es muy similar a la del estudiante en cuanto a las funcionalidades de **horario** y **perfil**, pero con algunas diferencias clave. Al igual que el estudiante, el profesor podrá consultar su **horario semanal** y acceder a los datos de su **perfil**. La principal diferencia radica en la sección de **asistencias**, ya que el profesor tendrá la capacidad de **pasar lista** en tiempo real para registrar las asistencias del día. Además, podrá **consultar el historial de asistencia** y, en caso de cometer algún error, tendrá la opción de **modificar** las asistencias de **días anteriores**, brindándole flexibilidad y control sobre el registro.

![alt text](<WIREFRAM BAJA FIDELIDAD/Aplicación mobil/Funcionalidades profesor.png>)

#### Plataforma administrador 

El **portal del empleado** contará con cuatro funcionalidades principales que le permitirán gestionar diversos aspectos relacionados con los usuarios y el control de asistencia. En primer lugar, tendrá la capacidad de **crear**, **modificar** y **eliminar** usuarios de tipo **profesor** y **alumno**, lo que le permitirá gestionar la base de datos de usuarios de manera eficiente. Además, podrá **ver el listado de asistencia de hoy**, **consultar el historial de asistencia** y verificar todos los **accesos de los estudiantes** al sistema. También podrá acceder a los **horarios de los alumnos y profesores**, con la capacidad de **modificarlos** si es necesario. Por último, contará con una sección de **perfil**, similar a la de los demás usuarios, donde podrá consultar y actualizar sus propios datos.



![alt text](<WIREFRAM BAJA FIDELIDAD/Aplicación mobil/Funcionalidades administrador.png>)
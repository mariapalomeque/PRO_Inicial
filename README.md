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





### Entorno Web

# Wireframe de Aplicación Web - Sistema de Asistencia

### 1. Página de Inicio - Marcador de Asistencia (Iniciar Sesión)
Se muestra un formulario de inicio de sesión con campos para ingresar usuario y contraseña, junto con un enlace para recuperar la contraseña en caso de olvido.

La página está diseñada para que los usuarios se autentiquen y accedan al sistema de asistencia. La interfaz es sencilla y directa, con un enfoque en facilitar el acceso rápido.

![Marcador de Asistencia](<WIREFRAM BAJA FIDELIDAD/Entorno web/inicar-sesion.png>)

### 2. Vista de Administrador
Una vez autenticado, el administrador tiene acceso a una tabla de usuarios, donde puede crear, editar, copiar, eliminar y exportar información de los trabajadores.
La tabla incluye detalles como nombre, apellido, sexo, correo electrónico, número de teléfono, edad, contraseña y cargo.
También cuenta con una función de búsqueda que permite filtrar la información. La interfaz es funcional, pensada para que el administrador gestione fácilmente los datos de los empleados.

![Vista de Administrador](<WIREFRAM BAJA FIDELIDAD/Entorno web/vista-administrador.png>)

### 3. Vista de Asistencia - Página de Profesor

Esta sección presenta una tabla con información sobre la asistencia de los empleados, permitiendo ver detalles de ausencias, retardos, almuerzos extendidos y retiros tempranos.
Se pueden aplicar filtros en cada categoría para una revisión específica.
La tabla incluye campos como ID, nombre, apellido, cargo, planta, horario de trabajo (entrada y salida), descanso y almuerzo.

![Página de Profesor](<WIREFRAM BAJA FIDELIDAD/Entorno web/vista-professor.png>)

### 4. Vista de Usuario

En esta página se muestra un perfil de usuario detallado, con información de contacto, cargo y horario laboral semanal.
Incluye un calendario mensual donde se registran las asistencias diarias (por ejemplo, "T" para trabajo y "D" para descanso).
También muestra el primer y último acceso al sistema, junto con un resumen de horas trabajadas.

![Vista de Usuario](<WIREFRAM BAJA FIDELIDAD/Entorno web/vista-usuario.png>)

---
<br><br>

![alt text](<Recursos visuales/Sprint 2.png>)

## Diseño de la base de datos de control de presencia

Este proyecto busca crear un sistema que registre quién entra y sale del colegio de forma sencilla y eficiente. Para lograrlo, diseñamos una base de datos que organiza información como los datos de alumnos, profesores y administradores, sus horarios y los registros de entrada y salida.

Además, hemos incluido detalles como los roles de cada usuario y un historial de cambios para que todo quede bien documentado. Esta base de datos será el corazón del sistema, conectando los datos con una aplicación móvil donde cada usuario podrá ver su información de forma clara y ordenada. 

![Diseño completo de la base de datos](<Diagrama BBDD/diseño UML.PNG>)

### Las tablas de la base de datos

#### Usuarios y Roles

La tabla Usuarios almacena la información básica de todas las personas que interactúan con el sistema, ya sean alumnos, profesores o administradores. Cada registro en esta tabla representa a un usuario único. Los campos principales son:

- id_usuario: Identificador único y principal de cada usuario. Es un número autoincremental.
- nombre y apellidos: Datos personales del usuario.
- dni: Documento de identificación del usuario. Es único para cada persona y se utiliza para validar identidad.
- correo: Email del usuario, utilizado para el inicio de sesión y la comunicación.
- contraseña: Clave de acceso al sistema (almacenada en formato cifrado por seguridad).
- telefono: Número de contacto del usuario.
- id_rol: Llave foránea que conecta al usuario con su rol correspondiente en la tabla Roles.
- curso: Información específica para alumnos (por ejemplo, DAM1A, DAW2B, etc.). Si el usuario no es alumno, este campo puede estar vacío.

La tabla Roles define los diferentes tipos de usuarios que interactúan con el sistema. Esto ayuda a organizar permisos y responsabilidades. Los campos principales son:

- id_rol: Identificador único para cada rol.
- nombre_rol: Nombre del rol, como Alumno, Profesor o Administrador.

La relación entre las tablas Usuarios y Roles es de tipo muchos a uno (N:1), ya que muchos usuarios pueden compartir un mismo rol, pero cada usuario tiene únicamente un rol asignado.
Cada registro en la tabla Usuarios tiene un campo id_rol que apunta a un registro en la tabla Roles.
Esta estructura facilita diferenciar las funcionalidades y permisos de cada tipo de usuario en el sistema.

![alt text](<Diagrama BBDD/BBDD_UsuariosARoles.PNG>)

#### Registro

La tabla Registro se utiliza para guardar los datos de las entradas y salidas de los usuarios del sistema. Cada vez que un usuario pasa su tarjeta, se genera un nuevo registro que se almacena en esta tabla. Los campos principales son:

- id_registro: Identificador único para cada registro.
- id_usuario: Llave foránea que conecta el registro con el usuario que realizó la acción.
- fecha Y hora: Fecha y hora exactas de la entrada o salida.
- tipo_registro: Indica si el registro corresponde a una entrada o una salida.

La relación entre las tablas Usuarios y Registro es de tipo uno a muchos (1), ya que:

Cada usuario puede generar múltiples registros (entradas y salidas a lo largo del tiempo).
Pero cada registro está asociado a un único usuario.
La tabla Registro tiene un campo id_usuario que actúa como llave foránea, vinculándolo con la tabla Usuarios.

![alt text](<Diagrama BBDD/BBDD_registro.PNG>)

#### Clases y Horarios

La tabla Clases agrupa a los usuarios según el grupo o curso al que pertenecen. Esto es útil principalmente para los estudiantes, ya que los horarios de clase suelen estar asignados a grupos enteros. Los campos principales de esta tabla son:

- id_clase: Identificador único de la clase (e.g., DAM1A, DAW2B).
- nombre_clase: Nombre descriptivo de la clase.
- descripcion: Información opcional sobre el curso o grupo.

La tabla Horarios contiene la información de los horarios asignados a las clases o profesores. En este caso, hemos planteado que los horarios se almacenen como imágenes, pero podría adaptarse en el futuro para un diseño más detallado. Los campos principales son:

- id_horario: Identificador único del horario.
- id_clase: Llave foránea que indica a qué clase pertenece el horario.
- imagenHorario: Ruta o nombre del archivo de la imagen del horario.

Relación entre Usuarios y Clases (N:1):

Cada usuario (alumno) pertenece a una sola clase, identificada por el campo id_clase.
Sin embargo, una clase puede tener varios alumnos asociados.
Ejemplo: Todos los estudiantes de DAM1A estarán asociados a la clase con id_clase = DAM1A.

Relación entre Clases y Horarios (1:1):

Cada clase tiene un único horario asignado.
Ejemplo: El horario de la clase DAW1B estará vinculado al registro con id_clase = DAW1B en la tabla Horarios.

Relación entre Horarios y Usuarios (Indirecta a través de Clases):

Aunque no hay una relación directa entre los usuarios y los horarios, un usuario puede consultar su horario a través de su clase.
Usuario con id_clase = DAM1A busca el horario en la tabla Horarios vinculado al registro con id_clase = DAM1A.

![alt text](<Diagrama BBDD/BBDD_clasesYHorarios.PNG>)

#### HistorialCambios

La tabla Historial de Cambios registra modificaciones realizadas sobre los datos de los usuarios. Esto permite un seguimiento detallado de quién, cuándo y qué se ha cambiado, ofreciendo transparencia y trnaquilidad en la gestión de la información.  Los campos principales son:

- id_cambio: Identificador único del cambio.
- id_usuario: Llave foránea que indica qué usuario fue afectado por el cambio.
- campo_modificado: El campo o atributo del usuario que fue modificado (e.g., email, nombre).
- valor_anterior: El valor que tenía el campo antes de la modificación.
- valor_nuevo: El valor que tiene el campo después de la modificación.
- fecha_cambio: Fecha y hora exacta del cambio.
- id_admin: Llave foránea que indica qué administrador o usuario realizó la modificación (referencia a id_usuario en la tabla Usuarios).

Relación directa entre Usuarios y Historial de Cambios(1:N):

Cada usuario puede tener múltiples registros en el historial de cambios, ya que sus datos pueden ser modificados varias veces.
La relación está establecida mediante el campo id_usuario en la tabla Historial de Cambios, que actúa como una llave foránea de la tabla Usuarios.
Si el correo de un usuario cambia de "pepito@iticbcn.cat" a "pepitopalotes@iticbcn.cat", se creará un registro en Historial de Cambios vinculado a ese usuario.

![alt text](<Diagrama BBDD/BBDD_historialCambios.PNG>)

Este diseño de la base de datos es el punto de partida para nuestra aplicación. Está bien estructurado para cubrir lo que necesitamos al principio, pero es posible que a medida que avancemos en el proyecto, sea necesario hacer algunos ajustes.

Durante el desarrollo, podríamos añadir nuevas tablas, modificar algunas existentes o hacer mejoras para que la app sea más fácil de crear o funcione de manera más eficiente. Esto es algo normal y parte del proceso de mejorar el sistema mientras seguimos trabajando en él.

En resumen, el diseño actual es sólido, pero está abierto a cambios que ayudarán a que el proyecto funcione aún mejor.

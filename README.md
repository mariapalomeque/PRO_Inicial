<h1 style="display: inline;">PROYECTO INICIAL</h1> 
<img src="Recursos visuales/LogoITIC.png" width="50" style="vertical-align: middle;" />

## Introducción 

Un grupo de cinco estudiantes del Instituto TIC de Barcelona se ha unido para formar un equipo de desarrolladores con el objetivo de crear un sistema de control de fichajes para una organización. Este equipo está compuesto por Luis Montiel (DAW), Aitor Santamaría (ASIX), Aaron Rodríguez (ASIX), Pau Chacón (DAM) y María Palomeque (DAM).

---

### Descripción del proyecto 
El objetivo principal del proyecto es desarrollar un sistema que permita registrar de manera precisa la entrada y salida de personas en espacios específicos dentro de un edificio. Para lograr esto, se creará un dispositivo basado en Arduino que lea datos de tarjetas RFID y envíe esta información a una base de datos centralizada.

Además, se integrarán varios componentes de infraestructura para garantizar la seguridad, escalabilidad y correcto funcionamiento del sistema en un entorno simulado de empresa. Esto incluye el diseño de una base de datos que contemple los requerimientos del proyecto y posibles ampliaciones futuras, así como la planificación y despliegue de la infraestructura de servidores en la infraestructura de Isard.

Desde el servidor, se recogerán las lecturas enviadas por el dispositivo y se guardarán en la base de datos, proporcionando feedback al dispositivo para indicar posibles errores. Este proyecto no solo busca desarrollar una solución técnica efectiva, sino también proporcionar una experiencia de aprendizaje integral para los estudiantes involucrados, preparándolos para futuros desafíos en el campo de la tecnología.

---

### Planificación del Proyecto

Para este proyecto, se implementará la metodología Agile, estructurando el desarrollo en siete sprints que permitirán avanzar de manera organizada y adaptativa. En cada sprint se abordarán tareas específicas para completar los diferentes aspectos del proyecto. Además, se utilizará un tablero Kanban en la herramienta Trello para distribuir las tareas entre los miembros del equipo y hacer un seguimiento continuo del estado de cada una. Con el tablero Kanban, se podrá visualizar de manera clara el progreso de cada tarea en sus diferentes etapas, desde "Pendiente" hasta "En proceso" y "Finalizada".<br><br>


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

En el primer sprint, los estudiantes de DAM y DAW se enfocarán en definir de manera profunda la logística y estructura del programa. A pesar de que se trabajará en formatos diferentes (web y aplicación móvil), ambas versiones deberán compartir una estética coherente y estable que mantenga la consistencia visual y funcional entre ambas plataformas.

Una vez que se tenga una idea clara de cómo será nuestra aplicación, se iniciará el diseño del wireframe de baja fidelidad. Este primer diseño mostrará únicamente una estructura base, con las principales funciones que deberá tener la aplicación. Conforme avance el proyecto, se desarrollará un segundo diseño de la aplicación, más elaborado y concreto, que permita una visión detallada del producto final, alineada con los objetivos y funcionalidades definidas desde el inicio.

Además, pueden acceder al Kanban de este primer sprint a través del siguiente enlace: [Trello Kanban Sprint 1](https://trello.com/invite/b/672a306125d7db1ec30293e2/ATTIf212ea20f08c3613c9efc530832732a2DBABB5D3/a02-4-sprint-1), donde podrán seguir el progreso de las tareas asignadas. También pueden revisar el Figma del wireframe de baja fidelidad en este enlace: [Wireframe Proyecto - Figma](https://www.figma.com/design/LIGys4AhyOJA7BgPnojR0F/WIREFRAME-PROYECTO?node-id=2003-368&t=Af2eXti2xyl8ThtI-1). En la carpeta de Wireframe de baja fidelidad, podrán encontrar las imágenes de los dos wireframes desarrollados hasta el momento.


---

### Aplicación movil 

#### Inicio de sesión 

La primera pantalla que aparece es la de inicio de sesión. En esta, se nos pedirá que seleccionemos una de las tres modalidades de usuario: alumno, profesor o administrador. Una vez realizada la selección, seremos redirigidos a la pantalla de inicio de sesión correspondiente, donde deberemos ingresar nuestras credenciales: el correo institucional y la contraseña.

Las cuentas serán creadas y gestionadas exclusivamente por el administrador del sistema, ya que solo un grupo determinado de personas podrá tener acceso autorizado a la aplicación. Además, será necesario que cada usuario tenga su cuenta vinculada con un chip de identificación, asegurando así que el acceso y control de presencia sea seguro y adecuado para cada tipo de usuario.

![alt text](<WIREFRAM BAJA FIDELIDAD/Aplicación mobil/Inicio sesión.png>)

---
#### Plataforma alumno


El portal del estudiante ofrece tres funcionalidades clave para facilitar el acceso a su información académica y personal. En primer lugar, permite consultar su horario de clases, organizado de manera clara y estructurada, lo que le facilita planificar su jornada académica. Además, cuenta con una sección de registro de asistencia, en la que el estudiante puede ver detalladamente sus entradas y salidas a lo largo de la semana, obteniendo una visión completa de sus asistencias registradas en cada sesión. Por último, en la sección de *Mi perfil*, el estudiante tiene acceso a los datos de su cuenta, además de la opción de cerrar sesión cuando lo desee.

![alt text](<WIREFRAM BAJA FIDELIDAD/Aplicación mobil/Funcionaliades alumno.png>)

---

#### Plataforma profesor

La plataforma del profesorado es muy similar a la del estudiante en cuanto a las funcionalidades de horario y perfil, pero con algunas diferencias clave. Al igual que el estudiante, el profesor podrá consultar su horario semanal y acceder a los datos de su perfil. La principal diferencia radica en la sección de asistencias, ya que el profesor tendrá la capacidad de pasar lista en tiempo real para registrar las asistencias del día. Además, podrá consultar el historial de asistencia y, en caso de cometer algún error, tendrá la opción de modificar las asistencias de días anteriores, brindándole flexibilidad y control sobre el registro.

![alt text](<WIREFRAM BAJA FIDELIDAD/Aplicación mobil/Funcionalidades profesor.png>)

#### Plataforma administrador 

El portal del empleado contará con cuatro funcionalidades principales que le permitirán gestionar diversos aspectos relacionados con los usuarios y el control de asistencia. En primer lugar, tendrá la capacidad de crear, modificar y eliminar usuarios de tipo profesor y alumno, lo que le permitirá gestionar la base de datos de usuarios de manera eficiente. Además, podrá ver el listado de asistencia de hoy, consultar el historial de asistencia y verificar todos los accesos de los estudiantes al sistema. También podrá acceder a los horarios de los alumnos y profesores, con la capacidad de modificarlos si es necesario. Por último, contará con una sección de perfil, similar a la de los demás usuarios, donde podrá consultar y actualizar sus propios datos.



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

En el Sprint 2, el equipo se centrará en establecer las bases tecnológicas que soportarán el proyecto, asegurando tanto la funcionalidad como la cohesión en las interfaces y servicios. Este sprint será fundamental para garantizar que todos los sistemas trabajen en sincronía y se ajusten a los requisitos definidos en la planificación.

Por un lado, los estudiantes de **ASIX** se encargarán del diseño y configuración de la **infraestructura de red y servidores**, un componente esencial para asegurar la conectividad y el soporte necesario para los dispositivos IoT que serán parte del sistema. Dentro de esta misma área, también se trabajará en la integración entre Arduino y AWS, enviando datos desde el dispositivo hasta la nube y visualizando estos datos una vez almacenados en AWS, demostrando la eficacia de la comunicación entre los elementos del proyecto.

Mientras tanto, un estudiante de **DAM** trabajarán en el **diseño  de la base de datos** destinada al control de presencia. Este diseño incluirá la creación de esquemas y estructuras que faciliten la gestión eficiente de los datos.

En paralelo, los estudiantes de **DAM y DAW** trabajarán en la creación de los **wireframes de alta fidelidad**, cada uno enfocado en su especialidad. La estudiante de **DAM** se encargarán del diseño del wireframe de alta fidelidad para la **aplicación móvil**, mientras que el estudiante de **DAW** desarrollarán el wireframe de alta fidelidad para la **web**. Estos diseños tendrán un alto nivel de detalle y reflejarán las funcionalidades clave y la estética general de las plataformas. Asimismo, se colaborará en la elaboración de una guía de estilos que definirá aspectos como colores, tipografías y otros elementos visuales para asegurar la coherencia y uniformidad en todos los componentes del proyecto.

Además, pueden acceder al **Kanban** de este segundo sprint a través del siguiente enlace: [Trello Kanban Sprint 2](https://trello.com/invite/b/67321584c468dfa0eb23f2eb/ATTI4ba9fd024d197d8f4dcb76bcb95f7ad8376B9ACF/a02-4-sprint-2), donde podrán seguir el progreso de las tareas asignadas. También pueden revisar el **Figma del wireframe de baja fidelidad** en este enlace: [Wireframe Proyecto - Figma](https://www.figma.com/design/LIGys4AhyOJA7BgPnojR0F/WIREFRAME-PROYECTO?node-id=2003-368&t=Af2eXti2xyl8ThtI-1). En la carpeta de **Wireframe de baja fidelidad**, podrán encontrar las imágenes de los dos wireframes desarrollados hasta el momento.

---

## Diseño de la base de datos de control de presencia

Este proyecto busca crear un sistema que registre quién entra y sale del colegio de forma sencilla y eficiente. Para lograrlo, diseñamos una base de datos que organiza información como los datos de alumnos, profesores y administradores, sus horarios y los registros de entrada y salida.

Además, hemos incluido detalles como los roles de cada usuario y un historial de cambios para que todo quede bien documentado. Esta base de datos será el corazón del sistema, conectando los datos con una aplicación móvil donde cada usuario podrá ver su información de forma clara y ordenada. 

![Diseño completo de la base de datos](<Diagrama BBDD/diseño UML.PNG>)

---

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

---

## Wireframe de Aplicación Web - Sistema de Asistencia

### 1. Página de Inicio (Iniciar Sesión)

1. Colores Primarios y Secundarios
Color principal: #0288d1 (Azul claro utilizado en la barra superior)
Color de acento: #ffffff (Blanco para fondo y elementos de texto principales)
Color de fondo secundario: #f5f5f5 (Gris claro para secciones secundarias)
Color de botón: #0288d1 (Azul de botón de acceso)
Color de enlace: #0288d1 (para enlaces como “¿Olvidó su contraseña?”)

2. Tipografía
Tipografía principal: Iner (p. ej., Arial, Helvetica)
Tamaño del título principal (h1): 32px, negrita
Tamaño de subtítulos (h2, h3): 20-24px, seminegrita
Tamaño del texto del cuerpo: 16px
Tamaño de texto de botones y enlaces: 14px, negrita para botones

3. Botones y Formularios
Botón de acceso:
Color de fondo: #0288d1
Color de texto: #ffffff
Bordes: Redondeados con un radio de 4px
Hover: Cambio a un tono más oscuro de azul
Campos de formulario:
Color de fondo: #ffffff
Bordes: Gris claro (#cccccc)
Placeholder: Texto gris claro para guiar al usuario

4. Íconos y Navegación
Íconos de navegación: Ubicados en la barra superior derecha
Estilo: Líneas simples, estilo minimalista, color #ffffff
Tamaño: 24px
Botones de red social: Estilo en color original de cada red social (Instagram, LinkedIn)

5. Imágenes y Multimedia
Tamaño de imágenes: Rectangular, con borde redondeado en las esquinas (radio de 8px)
Ubicación: A la derecha del formulario de acceso, alineada con el texto descriptivo.

6. Footer
Color de fondo: #0288d1
Texto: Blanco (#ffffff) con iconos en colores originales de los logotipos (Unión Europea, Generalitat de Catalunya)
Tamaño de texto: 14px para enlaces y texto de copyright

![Marcador de Asistencia](<WIREFRAME ALTA FIDELIDAD/Entorno web/Página de Inicio.png>)


### 1. Pagina de Usuario - Inici (Alumno)

Colores Principales
Azul Claro (#00AEEF): Usado en la barra de navegación y como fondo de ciertos botones.
Blanco (#FFFFFF): Fondo principal de la página.
Gris Claro (#EAEAEA): Fondo de botones de etiquetas, tablas, y algunos textos.
Negro/Gris Oscuro (#333333): Color principal para los textos.

2. Tipografía
Fuente: Roboto o Arial (sans-serif), para una apariencia limpia y moderna.
Tamaños:
Título principal ("Inici"): 24px, negrita.
Subtítulos (como "Detalles Usuario", "Informes"): 16px, negrita.
Texto de contenido (por ejemplo, correo electrónico, fecha): 14px.
Texto en tablas: 14px.

3. Componentes y Estilos de Elementos
Barra de Navegación Superior:

Color de Fondo: Azul claro (#00AEEF).
Íconos: Tamaño de 18px, color blanco. Íconos de perfil, ajustes y notificaciones alineados a la derecha.
Enlaces de Navegación: Texto en blanco, tamaño de fuente 16px, negrita. Incluye "Inicio", "Área personal", "Historial de Asistencia" y "Ajustes".
Botones de Etiquetas (como "Detalles Usuario", "Informes", etc.):

Color de Fondo: Gris claro (#EAEAEA).
Bordes: Redondeados, con un radio de 5px.
Tamaño de Fuente: 14px, negrita, color negro.
Tablas (por ejemplo, "Horario Laboral Semana" y "Calendario"):

Bordes: Finos y grises.
Celdas: Color de fondo blanco, texto negro o gris oscuro.
Encabezados de Tabla: Fondo gris claro, texto negro, fuente negrita.
Tamaño de Fuente: 14px.
Separación de Filas: Alineación centrada con espaciado generoso entre celdas (p. ej., 10px).
Sección de Informes:

Texto: Utiliza un estilo simple sin bordes adicionales. Resalta "Horas Trabajadas" y "Resumen de Horas" en negrita.
Footer:

Color de Fondo: Azul claro (#00AEEF).
Iconos de Redes Sociales: Colocados a la izquierda, tamaño de 24px.
Texto de Información Institucional: Centrado, tamaño de fuente 12px, color blanco.
4. Espaciado y Alineación

Margen Superior e Inferior de Secciones: 20px de margen para una separación clara.
Padding en Tablas y Botones: 10px para mantener un diseño limpio y ordenado.
Alineación: Todo el contenido debe estar alineado a la izquierda o centrado para una mejor legibilidad.
5. Interactividad

Efecto Hover en Navegación: Subrayado en los enlaces de navegación en la barra superior.
Efecto Hover en Iconos: Ligeramente más oscuro al pasar el cursor.
Botones: Cambian de color (por ejemplo, a un azul más oscuro) al hacer clic.

![Marcador de Asistencia](<WIREFRAME ALTA FIDELIDAD/Entorno web/Pagina de Usuario - Inici.png>)

### 1.1 Pagina de Usuario - Área personal

Colores Principales
Azul Claro (#00AEEF): Usado en la barra de navegación y como fondo de ciertos botones.
Blanco (#FFFFFF): Fondo principal de la página.
Gris Claro (#EAEAEA): Fondo de botones de etiquetas, tablas, y algunos textos.
Negro/Gris Oscuro (#333333): Color principal para los textos.

2. Tipografía
Fuente: Roboto o Arial (Iner), para una apariencia limpia y moderna.
Tamaños:
Título principal ("Inici"): 24px, negrita.
Subtítulos (como "Detalles Usuario", "Informes"): 16px, negrita.
Texto de contenido (por ejemplo, correo electrónico, fecha): 14px.
Texto en tablas: 14px.

3. Componentes y Estilos de Elementos
Barra de Navegación Superior:

Color de Fondo: Azul claro (#00AEEF).
Íconos: Tamaño de 18px, color blanco. Íconos de perfil, ajustes y notificaciones alineados a la derecha.
Enlaces de Navegación: Texto en blanco, tamaño de fuente 16px, negrita. Incluye "Inicio", "Área personal", "Historial de Asistencia" y "Ajustes".
Botones de Etiquetas (como "Detalles Usuario", "Informes", etc.):

Color de Fondo: Gris claro (#EAEAEA).
Bordes: Redondeados, con un radio de 5px.
Tamaño de Fuente: 14px, negrita, color negro.
Tablas (por ejemplo, "Horario Laboral Semana" y "Calendario"):

Bordes: Finos y grises.
Celdas: Color de fondo blanco, texto negro o gris oscuro.
Encabezados de Tabla: Fondo gris claro, texto negro, fuente negrita.
Tamaño de Fuente: 14px.
Separación de Filas: Alineación centrada con espaciado generoso entre celdas (p. ej., 10px).
Sección de Informes:

Texto: Utiliza un estilo simple sin bordes adicionales. Resalta "Horas Trabajadas" y "Resumen de Horas" en negrita.
Footer:

Color de Fondo: Azul claro (#00AEEF).
Iconos de Redes Sociales: Colocados a la izquierda, tamaño de 24px.
Texto de Información Institucional: Centrado, tamaño de fuente 12px, color blanco.

4. Espaciado y Alineación
Margen Superior e Inferior de Secciones: 20px de margen para una separación clara.
Padding en Tablas y Botones: 10px para mantener un diseño limpio y ordenado.
Alineación: Todo el contenido debe estar alineado a la izquierda o centrado para una mejor legibilidad.

5. Interactividad
Efecto Hover en Navegación: Subrayado en los enlaces de navegación en la barra superior.
Efecto Hover en Iconos: Ligeramente más oscuro al pasar el cursor.
Botones: Cambian de color (por ejemplo, a un azul más oscuro) al hacer clic.

6. Íconos y Elementos Gráficos
Usa íconos minimalistas y limpios para perfiles, ajustes y notificaciones, alineados con el estilo de Material Design.
Logos institucionales en el footer deben mantener sus colores originales y no tener efectos adicionales para resaltar la autenticidad.

![Marcador de Asistencia](<WIREFRAME ALTA FIDELIDAD/Entorno web/Pagina de Usuario - Área personal.png>)

### 1.2 Pagina de Usuario - Historial de Asistencia

1.Colores Principales
Verde (#00CC00): Representa "Presente".
Amarillo (#FFD700): Representa "Retard".
Rojo (#FF0000): Representa "Absent".
Azul Claro (#00AEEF): Usado en la barra de navegación.
Gris Claro (#EAEAEA): Fondo de botones y etiquetas.
Blanco (#FFFFFF): Fondo principal de la página.
Negro/Gris Oscuro (#333333): Color principal para los textos.

2. Tipografía
Fuente: Roboto o Arial (Iner).
Tamaños:
Título principal ("Historial de Asistencia"): 24px, negrita.
Subtítulos (por ejemplo, "Resumen Semanal"): 16px, negrita.
Texto de contenido: 14px para descripciones y etiquetas.
Etiquetas de colores (Presente, Retard, Absent): 14px, negrita, en color blanco.

3. Componentes y Estilos de Elementos
Gráfico de Pastel:

Segmentos de Colores: Verde, Amarillo y Rojo.
Leyenda: Etiquetas en el lado derecho, con puntos de color correspondientes.
Texto de Leyenda: Tamaño de fuente 14px, alineado a la derecha del gráfico.
Tabla de Asistencia:

Bordes: Finos y en color gris.
Celdas: Fondo blanco, texto en negro.
Encabezados de Columna: Colores de fondo que coinciden con las etiquetas (Verde, Amarillo, Rojo), con texto en blanco.
Tamaño de Fuente: 14px.
Botones de Etiquetas (como "Aula", "Presente", "Retard", "Absent"):

Color de Fondo: Correspondiente al estado (Verde para Presente, Amarillo para Retard, Rojo para Absent).
Bordes: Redondeados, con un radio de 5px.
Tamaño de Fuente: 14px, negrita, en blanco.
Footer:

Color de Fondo: Azul claro (#00AEEF).
Iconos de Redes Sociales: Colocados a la izquierda, tamaño de 24px.
Texto de Información Institucional: Centrado, tamaño de fuente 12px, color blanco.

4. Espaciado y Alineación
Margen Superior e Inferior de Secciones: 20px para separación clara.
Padding en Gráfico y Tabla: 10px para mantener el diseño limpio.
Alineación: Contenido principal centrado, con leyenda del gráfico alineada a la derecha.

5. Interactividad
Efecto Hover en Navegación: Subrayado en los enlaces de navegación en la barra superior.
Botones de Etiquetas (Aula, Presente, etc.): Cambian de color al pasar el cursor para dar retroalimentación visual.

![Marcador de Asistencia](<WIREFRAME ALTA FIDELIDAD/Entorno web/Pagina de Usuario - Historial de Asistencia.png>)


### 2 Página de Administrador - Inicio

1. Colores Principales
Azul Claro (#00AEEF): Usado en la barra de navegación y en los botones de acciones (Create, Edit, Copy, Delete).
Gris Claro (#EAEAEA): Fondo de los botones y algunos encabezados de tabla.
Blanco (#FFFFFF): Fondo principal de la página.
Negro/Gris Oscuro (#333333): Color principal para los textos.

2. Tipografía
Fuente: Roboto o Arial (-serisansf).
Tamaños:
Título principal ("Inicio"): 24px, negrita.
Botones de Acciones ("Create", "Edit", etc.): 14px, negrita, centrado.
Encabezados de la Tabla: 16px, negrita, en mayúsculas.
Contenido de la Tabla: 14px, regular.

3. Componentes y Estilos de Elementos
Barra de Navegación Superior:

Color de Fondo: Azul claro (#00AEEF).
Enlaces de Navegación: Texto en blanco, tamaño de fuente 16px, negrita. Incluye "Inicio", "Estadísticas Generales", "Notificaciones y Alertas", y "Gestión de Usuarios".
Botones de Acción ("Create", "Edit", etc.):

Color de Fondo: Gris claro (#EAEAEA), con texto en azul claro (#00AEEF).
Bordes: Redondeados, con un radio de 5px.
Hover: Color de fondo azul claro (#00AEEF) con texto en blanco.
Tamaño de Fuente: 14px, centrado.
Tabla de Datos de Usuarios:

Encabezados de la Tabla: Fondo gris claro, texto en negrita y negro.
Celdas de Contenido: Fondo blanco, texto en gris oscuro.
Bordes: Delgados y en gris para separar filas y columnas.
Check Box: Para seleccionar usuarios, ubicado al inicio de cada fila.
Buscar en la Tabla: Campo de búsqueda alineado a la derecha con borde gris claro.
Footer:

Color de Fondo: Azul claro (#00AEEF).
Iconos de Redes Sociales: Tamaño de 24px, alineados a la izquierda.
Texto Institucional: Centrado, tamaño de fuente 12px, color blanco.

4. Espaciado y Alineación
Margen Superior e Inferior de Secciones: 20px para una separación clara.
Padding en Botones y Tabla: 10px.
Alineación: Contenido centrado en los botones de acción y en el campo de búsqueda.

5. Interactividad
Efecto Hover en Navegación: Subrayado en los enlaces de navegación.
Hover en Botones de Acción: Cambian de color a azul claro con texto en blanco.
Campo de Búsqueda: Cambia de borde a un gris más oscuro cuando se enfoca.

6. Íconos y Elementos Gráficos
Usa iconos para "Crear", "Editar", "Copiar", y "Eliminar" con estilo minimalista en botones, siguiendo los colores descritos para una apariencia consistente.

![Marcador de Asistencia](<WIREFRAME ALTA FIDELIDAD/Entorno web/Página de Administrador - Inicio.png>)


### 2.1 Pagina de Administrador - Estadísticas Generales 

1. Colores Primarios y Secundarios:
Color principal: #0288d1 (Azul claro utilizado en la barra superior)
Color de acento: #ffffff (Blanco para fondo y elementos de texto principales)
Color de fondo secundario: #f5f5f5 (Gris claro para secciones secundarias)
Color de botón: #0288d1 (Azul de botón de acceso)
Color de enlace: #0288d1 (para enlaces como “¿Olvidó su contraseña?”)

2. Tipografía:
Tipografía principal: Sans-serif (p. ej., Arial, Helvetica)
Tamaño del título principal (h1): 32px, negrita
Tamaño de subtítulos (h2, h3): 20-24px, seminegrita
Tamaño del texto del cuerpo: 16px

Tamaño de texto de botones y enlaces: 14px, negrita para botones

3. Botones y Formularios:
Botón de acceso:
Color de fondo: #0288d1
Color de texto: #ffffff
Bordes: Redondeados con un radio de 4px
Hover: Cambio a un tono más oscuro de azul
Campos de formulario:
Color de fondo: #ffffff
Bordes: Gris claro (#cccccc)
Placeholder: Texto gris claro para guiar al usuario

4. Íconos y Navegación:
Íconos de navegación: Ubicados en la barra superior derecha
Estilo: Líneas simples, estilo minimalista, color #ffffff
Tamaño: 24px
Botones de red social: Estilo en color original de cada red social (Instagram, LinkedIn)

5. Imágenes y Multimedia:
Tamaño de imágenes: Rectangular, con borde redondeado en las esquinas (radio de 8px)
Ubicación: A la derecha del formulario de acceso, alineada con el texto descriptivo.

6. Footer:
Color de fondo: #0288d1
Texto: Blanco (#ffffff) con iconos en colores originales de los logotipos (Unión Europea, Generalitat de Catalunya)

![Marcador de Asistencia](<WIREFRAME ALTA FIDELIDAD/Entorno web/Pagina de Administrador - Estadísticas Generales.png>)

### 2.2 Pagina de Administrador - Notificaciones y Alertas 

1. Colores Primarios y Secundarios:
Color principal: #0288d1 (Azul claro utilizado en la barra superior)
Color de acento: #ffffff (Blanco para fondo y elementos de texto principales)
Color de fondo secundario: #f5f5f5 (Gris claro para secciones secundarias)
Color de botón: #0288d1 (Azul de botón de acceso)
Color de enlace: #0288d1 (para enlaces como “¿Olvidó su contraseña?”)

2. Tipografía:
Tipografía principal: Sans-serif (p. ej., Arial, Helvetica)
Tamaño del título principal (h1): 32px, negrita
Tamaño de subtítulos (h2, h3): 20-24px, seminegrita
Tamaño del texto del cuerpo: 16px
Tamaño de texto de botones y enlaces: 14px, negrita para botones

3. Botones y Formularios:
Botón de acceso:
Color de fondo: #0288d1
Color de texto: #ffffff
Bordes: Redondeados con un radio de 4px
Hover: Cambio a un tono más oscuro de azul
Campos de formulario:
Color de fondo: #ffffff
Bordes: Gris claro (#cccccc)
Placeholder: Texto gris claro para guiar al usuario

4. Íconos y Navegación:
Íconos de navegación: Ubicados en la barra superior derecha
Estilo: Líneas simples, estilo minimalista, color #ffffff
Tamaño: 24px
Botones de red social: Estilo en color original de cada red social (Instagram, LinkedIn)

5. Imágenes y Multimedia:
Tamaño de imágenes: Rectangular, con borde redondeado en las esquinas (radio de 8px)
Ubicación: A la derecha del formulario de acceso, alineada con el texto descriptivo.

6. Footer:
Color de fondo: #0288d1
Texto: Blanco (#ffffff) con iconos en colores originales de los logotipos (Unión Europea, Generalitat de Catalunya)

![Marcador de Asistencia](<WIREFRAM BAJA FIDELIDAD/Entorno web/inicar-sesion.png>)

### 2.3 Pagina de Administrador - Notificaciones y Alertas 

1. Colores Primarios y Secundarios:
Color principal: #0288d1 (Azul claro utilizado en la barra superior)
Color de acento: #ffffff (Blanco para fondo y elementos de texto principales)
Color de fondo secundario: #f5f5f5 (Gris claro para secciones secundarias)
Color de botón: #0288d1 (Azul de botón de acceso)
Color de enlace: #0288d1 (para enlaces como “¿Olvidó su contraseña?”)

2. Tipografía:
Tipografía principal: Sans-serif (p. ej., Arial, Helvetica)
Tamaño del título principal (h1): 32px, negrita
Tamaño de subtítulos (h2, h3): 20-24px, seminegrita
Tamaño del texto del cuerpo: 16px
Tamaño de texto de botones y enlaces: 14px, negrita para botones

3. Botones y Formularios:
Botón de acceso:
Color de fondo: #0288d1
Color de texto: #ffffff
Bordes: Redondeados con un radio de 4px
Hover: Cambio a un tono más oscuro de azul
Campos de formulario:
Color de fondo: #ffffff
Bordes: Gris claro (#cccccc)
Placeholder: Texto gris claro para guiar al usuario

4. Íconos y Navegación:
Íconos de navegación: Ubicados en la barra superior derecha
Estilo: Líneas simples, estilo minimalista, color #ffffff
Tamaño: 24px
Botones de red social: Estilo en color original de cada red social (Instagram, LinkedIn)

5. Imágenes y Multimedia:
Tamaño de imágenes: Rectangular, con borde redondeado en las esquinas (radio de 8px)
Ubicación: A la derecha del formulario de acceso, alineada con el texto descriptivo.

6. Footer:
Color de fondo: #0288d1
Texto: Blanco (#ffffff) con iconos en colores originales de los logotipos (Unión Europea, Generalitat de Catalunya)

![Marcador de Asistencia](<WIREFRAME ALTA FIDELIDAD/Entorno web/Pagina de Administrador - Notificaciones y Alertas.png>)

### 2.4 Pagina de Administrador - Gestión de Usuarios 

1. Colores Primarios y Secundarios:
Color principal: #0288d1 (Azul claro utilizado en la barra superior)
Color de acento: #ffffff (Blanco para fondo y elementos de texto principales)
Color de fondo secundario: #f5f5f5 (Gris claro para secciones secundarias)
Color de botón: #0288d1 (Azul de botón de acceso)
Color de enlace: #0288d1 (para enlaces como “¿Olvidó su contraseña?”)

2. Tipografía:
Tipografía principal: Sans-serif (p. ej., Arial, Helvetica)
Tamaño del título principal (h1): 32px, negrita
Tamaño de subtítulos (h2, h3): 20-24px, seminegrita
Tamaño del texto del cuerpo: 16px
Tamaño de texto de botones y enlaces: 14px, negrita para botones

3. Botones y Formularios:
Botón de acceso:
Color de fondo: #0288d1
Color de texto: #ffffff
Bordes: Redondeados con un radio de 4px
Hover: Cambio a un tono más oscuro de azul
Campos de formulario:
Color de fondo: #ffffff
Bordes: Gris claro (#cccccc)
Placeholder: Texto gris claro para guiar al usuario

4. Íconos y Navegación:
Íconos de navegación: Ubicados en la barra superior derecha
Estilo: Líneas simples, estilo minimalista, color #ffffff
Tamaño: 24px
Botones de red social: Estilo en color original de cada red social (Instagram, LinkedIn)

5. Imágenes y Multimedia:
Tamaño de imágenes: Rectangular, con borde redondeado en las esquinas (radio de 8px)
Ubicación: A la derecha del formulario de acceso, alineada con el texto descriptivo.

6. Footer:
Color de fondo: #0288d1
Texto: Blanco (#ffffff) con iconos en colores originales de los logotipos (Unión Europea, Generalitat de Catalunya)

![Marcador de Asistencia](<WIREFRAME ALTA FIDELIDAD/Entorno web/Pagina de Administrador - Gestión de Usuarios.png>)

### 3 Pagina de Professor - Inicio

1. Colores Primarios y Secundarios:
Color principal: #0288d1 (Azul claro utilizado en la barra superior)
Color de acento: #ffffff (Blanco para fondo y elementos de texto principales)
Color de fondo secundario: #f5f5f5 (Gris claro para secciones secundarias)
Color de botón: #0288d1 (Azul de botón de acceso)
Color de enlace: #0288d1 (para enlaces como “¿Olvidó su contraseña?”)

2. Tipografía:
Tipografía principal: Sans-serif (p. ej., Arial, Helvetica)
Tamaño del título principal (h1): 32px, negrita
Tamaño de subtítulos (h2, h3): 20-24px, seminegrita
Tamaño del texto del cuerpo: 16px
Tamaño de texto de botones y enlaces: 14px, negrita para botones

3. Botones y Formularios:
Botón de acceso:
Color de fondo: #0288d1
Color de texto: #ffffff
Bordes: Redondeados con un radio de 4px
Hover: Cambio a un tono más oscuro de azul
Campos de formulario:
Color de fondo: #ffffff
Bordes: Gris claro (#cccccc)
Placeholder: Texto gris claro para guiar al usuario

4. Íconos y Navegación:
Íconos de navegación: Ubicados en la barra superior derecha
Estilo: Líneas simples, estilo minimalista, color #ffffff
Tamaño: 24px
Botones de red social: Estilo en color original de cada red social (Instagram, LinkedIn)

5. Imágenes y Multimedia:
Tamaño de imágenes: Rectangular, con borde redondeado en las esquinas (radio de 8px)
Ubicación: A la derecha del formulario de acceso, alineada con el texto descriptivo.

6. Footer:
Color de fondo: #0288d1
Texto: Blanco (#ffffff) con iconos en colores originales de los logotipos (Unión Europea, Generalitat de Catalunya)

![Marcador de Asistencia](<WIREFRAME ALTA FIDELIDAD/Entorno web/Pagina de Professor - Inicio.png>)

### 3.1 Pagina de Professor - Reportes de Asistencia

1.Colores Primarios y Secundarios:
Color principal: #0288d1 (Azul claro utilizado en la barra superior)
Color de acento: #ffffff (Blanco para fondo y elementos de texto principales)
Color de fondo secundario: #f5f5f5 (Gris claro para secciones secundarias)
Color de botón: #0288d1 (Azul de botón de acceso)
Color de enlace: #0288d1 (para enlaces como “¿Olvidó su contraseña?”)

2. Tipografía:
Tipografía principal: Sans-serif (p. ej., Arial, Helvetica)
Tamaño del título principal (h1): 32px, negrita
Tamaño de subtítulos (h2, h3): 20-24px, seminegrita
Tamaño del texto del cuerpo: 16px
Tamaño de texto de botones y enlaces: 14px, negrita para botones

3. Botones y Formularios:
Botón de acceso:
Color de fondo: #0288d1
Color de texto: #ffffff
Bordes: Redondeados con un radio de 4px
Hover: Cambio a un tono más oscuro de azul
Campos de formulario:
Color de fondo: #ffffff
Bordes: Gris claro (#cccccc)
Placeholder: Texto gris claro para guiar al usuario

4. Íconos y Navegación:
Íconos de navegación: Ubicados en la barra superior derecha
Estilo: Líneas simples, estilo minimalista, color #ffffff
Tamaño: 24px
Botones de red social: Estilo en color original de cada red social (Instagram, LinkedIn)

5. Imágenes y Multimedia:
Tamaño de imágenes: Rectangular, con borde redondeado en las esquinas (radio de 8px)
Ubicación: A la derecha del formulario de acceso, alineada con el texto descriptivo.

6. Footer:
Color de fondo: #0288d1
Texto: Blanco (#ffffff) con iconos en colores originales de los logotipos (Unión Europea, Generalitat de Catalunya)

![Marcador de Asistencia](<WIREFRAME ALTA FIDELIDAD/Entorno web/Pagina de Professor - Reportes de Asistencia.png>)


### 3.2 Pagina de Professor - Área personal

1. Colores Primarios y Secundarios:
Color principal: #0288d1 (Azul claro utilizado en la barra superior)
Color de acento: #ffffff (Blanco para fondo y elementos de texto principales)
Color de fondo secundario: #f5f5f5 (Gris claro para secciones secundarias)
Color de botón: #0288d1 (Azul de botón de acceso)
Color de enlace: #0288d1 (para enlaces como “¿Olvidó su contraseña?”)

2. Tipografía:
Tipografía principal: Sans-serif (p. ej., Arial, Helvetica)
Tamaño del título principal (h1): 32px, negrita
Tamaño de subtítulos (h2, h3): 20-24px, seminegrita
Tamaño del texto del cuerpo: 16px
Tamaño de texto de botones y enlaces: 14px, negrita para botones

3. Botones y Formularios:
Botón de acceso:
Color de fondo: #0288d1
Color de texto: #ffffff
Bordes: Redondeados con un radio de 4px
Hover: Cambio a un tono más oscuro de azul
Campos de formulario:
Color de fondo: #ffffff
Bordes: Gris claro (#cccccc)
Placeholder: Texto gris claro para guiar al usuario

4. Íconos y Navegación:
Íconos de navegación: Ubicados en la barra superior derecha
Estilo: Líneas simples, estilo minimalista, color #ffffff
Tamaño: 24px
Botones de red social: Estilo en color original de cada red social (Instagram, LinkedIn)

5. Imágenes y Multimedia:
Tamaño de imágenes: Rectangular, con borde redondeado en las esquinas (radio de 8px)
Ubicación: A la derecha del formulario de acceso, alineada con el texto descriptivo.

6. Footer:
Color de fondo: #0288d1
Texto: Blanco (#ffffff) con iconos en colores originales de los logotipos (Unión Europea, Generalitat de Catalunya)

![Marcador de Asistencia](<WIREFRAME ALTA FIDELIDAD/Entorno web/Pagina de Professor - Área personal.png>)

---
<<<<<<< HEAD
=======

## Wireframe de alta fidelidad aplicación mobil 

### Guia de estilos

El diseño de la aplicación prioriza la claridad, la funcionalidad y la coherencia visual. Utiliza una paleta de colores cuidadosamente elegida para lograr un equilibrio entre funcionalidad y estética; el color principal es un tono azul brillante, identificado como #2596BE, y se aplica a botones, elementos interactivos y notificaciones importantes para llamar la atención del usuario sobre acciones clave. 
El color de fondo principal elegido fue #F5F5F5, un gris muy claro que crea un ambiente visual limpio y profesional, reduce la fatiga visual y resalta los elementos interactivos. Además de esta paleta de colores, el uso de colores blanco y negro para textos y elementos gráficos garantiza un contraste claro y una legibilidad excelente.

La fuente elegida para el sistema es Inter, una fuente moderna y universal, perfectamente adaptada a las necesidades de las interfaces digitales.Esta fuente tiene un diseño limpio y legible incluso en tamaños pequeños. Los títulos y subtítulos están en negrita para crear una jerarquía visual clara, mientras que el texto de respaldo y las descripciones están en fuente normal para una lectura fácil y sin distracciones.

En términos de gráficos, se mantiene la coherencia visual. Esto mejora la identidad del sistema. Aunque estos íconos no vienen en el mismo paquete, todos presentan diseños minimalistas con líneas finas y limpias. Esto garantiza que los iconos estén visualmente alineados entre sí, lo que proporciona a los usuarios una interpretación sencilla e instantánea.

La estructura general del sistema mantiene una estética minimalista y funcional, manteniendo la coherencia visual con espacios en blanco utilizados estratégicamente para evitar la saturación visual. Hay suficiente espacio entre elementos para garantizar una navegación fluida y ordenada. Los formularios y los componentes visuales son concisos y se centran en lo esencial, añadiendo claridad a la presentación de la información.

### Pantalla inicio de sesion, y registro

Al abrir la aplicación, el usuario es recibido con la pantalla de bienvenida que muestra el logotipo del Institut TIC de Barcelona junto al nombre de la institución. Debajo del logotipo, se presentan tres botones grandes: "Alumno," "Maestro" y "Administrador." Estos botones permiten seleccionar el rol, dirigiendo al usuario a la pantalla de inicio de sesión correspondiente. La interfaz es simple y limpia, orientada a una fácil navegación desde el primer acceso.

Después de seleccionar el rol , el usuario será redirigido a la pantalla de inicio de sesión donde se le solicitarán sus credenciales. Hay dos campos de entrada: uno para correo electrónico y otro para contraseña. El botón azul con la etiqueta "Iniciar sesión" le permite ser dirigido al portal después de completar los campos. 

![alt text](<WIREFRAME ALTA FIDELIDAD/Aplicación mobil/Inicio de sesion.png>)

## Portal alumno

### Pantalla horario 

Esta pantalla muestra el horario de clases del alumno para el curso actual. En la parte superior, se presenta una opción de selección de curso, permitiendo al alumno escoger el año académico en caso de que tenga horarios distintos. A continuación, se despliega una tabla organizada que muestra las materias, horas y ubicaciones de cada clase. Un botón destacado en color azul permite descargar el horario en formato PDF para consultarlo offline, una funcionalidad útil para facilitar el acceso al horario en cualquier momento.

![alt text](<WIREFRAME ALTA FIDELIDAD/Aplicación mobil/Alumno/Horario.png>)

### Pantalla registro de asistencia 

En esta vista, el alumno puede revisar su historial de asistencias. La pantalla muestra un resumen semanal, organizado por días, con horas de entrada y salida registradas para cada clase o actividad. Los datos se presentan de forma estructurada para que el alumno pueda fácilmente ver su historial de entradas y salidas de el instituto en una misma pantalla.

Tambien es posible consultar semanas anteriores, presionado el simbolo de luba en la parte superior se desplega un calendario, con el cual el alumno tiene la posibilidad de seleccionar una semana específica.

![alt text](<WIREFRAME ALTA FIDELIDAD/Aplicación mobil/Alumno/Asistencias.png>)

### Pantalla perfil 

La sección de perfil permite al alumno ver su información personal. En esta pantalla se muestran campos como nombre, email, teléfono, clase y curso, organizados en una lista clara. También hay un botón para editar la foto de perfil y un botón destacado en la parte inferior para cerrar sesión. Esta pantalla proporciona acceso rápido a la información de contacto y detalles académicos del alumno.

![alt text](<WIREFRAME ALTA FIDELIDAD/Aplicación mobil/Alumno/Perfil.png>)


## Portal profesorado

### Pantalla horario 

Muestra el horario del curso. la estructura es similar a la pantalla de horario del alumno, pero con la posibilidad de editar el horario. Incluye un botón en azul para descargar el horario en formato PDF, facilitando el acceso offline y la revisión en cualquier momento.

![alt text](<WIREFRAME ALTA FIDELIDAD/Aplicación mobil/Profesorado/Horario.png>)

### Pantalla asistencias

Esta pantalla es un panel de control para la gestión de asistencias. En el centro de la pantalla, el profesor tiene dos opciones: "Asistencia Hoy" y "Consultar Asistencias." 

![alt text](<WIREFRAME ALTA FIDELIDAD/Aplicación mobil/Profesorado/Asistencias.png>)

### Pantalla asistencias hoy

Aquí el profesor ve una lista de las clases del día, con detalles sobre el inicio y el fin de cada clase, debera seleccionar la que desee. 

Tras las seleccióm aparecera la listta de alumnos de dicho curso, podra marcar la asistencia de los estudiantes en una clase específica. Para cada alumno, el profesor puede seleccionar entre varias opciones: "Asistencia," "Retraso," "Falta" y "Falta Justificada." Cada opción está claramente identificada, permitiendo al profesor llevar un control preciso de la asistencia. Esta funcionalidad es ideal para un proceso rápido durante el pase de lista en clases o reuniones.

![alt text](<WIREFRAME ALTA FIDELIDAD/Aplicación mobil/Profesorado/Asistencias hoy.png>)

### Pantalla consultar asistencias 

En esta pantalla, el profesor puede seleccionar una fecha específica en un calendario visual, se aabrira un listado de aulas.ermite al profesor consultar la asistencia organizada por aula, facilitando la visualización de las clases que ha dado en cada espacio y acceder a los registros de asistencia de esa jornada. Esta funcionalidad es útil para revisar días específicos o analizar patrones de asistencia en fechas concretas.

![alt text](<WIREFRAME ALTA FIDELIDAD/Aplicación mobil/Profesorado/Consultar asistencia.png>)

### Pantalla perfil

La sección de perfil permite al profesor ver  su información personal. En esta pantalla se muestran campos como nombre, email, teléfono, materias que realiza, organizados en una lista clara. También hay un botón para editar la foto de perfil y un botón destacado en la parte inferior para cerrar sesión. Esta pantalla proporciona acceso rápido a la información de contacto y detalles académicos del alumno.

![alt text](<WIREFRAME ALTA FIDELIDAD/Aplicación mobil/Profesorado/Perfil.png>)

## Portal administrador

### Pantalla horario

Similar a la vista del profesor, pero con la opción adicional de crear, modificar y gestionar los horarios de toda la institución. El administrador puede seleccionar un curso o grupo y editar directamente los detalles del horario, asegurando que los cambios se reflejen en el sistema. 

En la parte inferior, se encuentra la barra de navegación que incluye los íconos de diferentes secciones: "Horario", "Registro", "Asistencias" y "Perfil", permitiendo al usuario desplazarse fácilmente entre las distintas funciones de la aplicación.

![alt text](<WIREFRAME ALTA FIDELIDAD/Aplicación mobil/Administrador/Horario.png>)

### Creación , modificación o eliminación de un usuario

sta pantalla sirve como panel de administración de usuarios, donde el administrador puede gestionar los registros de alumnos y profesores. Hay opciones para registrar nuevos usuarios o editar y eliminar perfiles existentes, organizadas de manera que facilita la navegación entre los perfiles.

Si selecciona la opcion de registrar nuevo alumno se le abrira una pantalla donde podra  crear nuevos perfiles. Se incluyen campos para ingresar correo electrónico, contraseña. Un botón "Crear cuenta" permite guardar el registro y habilitar el acceso del alumno al sistema. 

Si selecciona Editar / Eliminar profesor podra modificar y gestionar la información de los profesores registrados en el sistema. En la parte superior, se incluye un campo de búsqueda donde se puede introducir el correo electrónico del profesor para localizar su perfil rápidamente.

En el área de detalles, se muestra información clave sobre el profesor: su nombre completo, dirección de correo electrónico, número de teléfono y las materias que imparte. Cada dato puede ser editado seleccionando el campo correspondiente.

Debajo de esta información, se encuentra el botón azul "Guardar modificaciones", que permite al administrador confirmar y aplicar los cambios realizados en los datos del profesor.

Más abajo, se ofrece una opción de eliminación de cuenta, indicada con un texto en rojo que dice "ELIMINAR CUENTA". Este botón permite borrar completamente el perfil del profesor del sistema, una acción que suele ser irreversible y requiere precaución.

![alt text](<WIREFRAME ALTA FIDELIDAD/Aplicación mobil/Administrador/Registro.png>)

### Pantalla Consultar asistencias 

Esta pantalla permite al administrador seleccionar entre dos opciones relacionadas con la gestión de asistencias de los alumnos.

![alt text](<WIREFRAME ALTA FIDELIDAD/Aplicación mobil/Administrador/Consultar asistencia.png>)

En la parte superior de la pantalla se presenta la pregunta "¿Qué deseas ver ahora?" como una invitación al usuario para elegir una acción. Debajo de esta pregunta, hay dos botones con íconos ilustrativos y textos descriptivos:

Consultar asistencias: Esta opción dirige al usuario a una vista donde debera sleccionar la fecha y posteriormente la aula que desea cosnultar, y puede revisar los registros de asistencia de los alumnos, incluyendo detalles de horas.

![alt text](<WIREFRAME ALTA FIDELIDAD/Aplicación mobil/Administrador/Asistencias.png>)

Registro de accesos de alumnos: Esta opción permite al administrador acceder a un historial detallado de los accesos de los alumnos al edificio o a zonas específicas, ayudando a llevar un control de su movimiento dentro de las instalaciones. Primero, debera sleccionar la clase, luego aparecera el  listado de alumnos y debera seleccionar uno. 

![alt text](<WIREFRAME ALTA FIDELIDAD/Aplicación mobil/Administrador/Accesos alumnos.png>)


### Pantalla perfil 

Esta pantalla muestra el perfil del administrador, con su foto, nombre, correo y teléfono. Incluye opciones para editar la foto de perfil y cerrar sesión.

![alt text](<WIREFRAME ALTA FIDELIDAD/Aplicación mobil/Administrador/Paste.png>)


<br><br>

![alt text](<Recursos visuales/Sprint 3.png>)


<<<<<<< HEAD
El Sprint 3 se enfocará en consolidar la infraestructura técnica y avanzar en componentes fundamentales del sistema.

Los estudiantes de ASIX liderarán el diseño y la configuración de la infraestructura tecnológica, abordando dos tareas cruciales. En primer lugar, trabajarán en la creación de la infraestructura de la base de datos, estableciendo roles, permisos y realizando las comprobaciones necesarias para garantizar la seguridad y funcionalidad del sistema de almacenamiento de datos. Además, implementarán la infraestructura de servidores y red del proyecto, que incluye la configuración de servidores web, la red interna y la gestión de usuarios SSH, asegurando la conectividad y estabilidad necesarias para las operaciones del sistema.

Por su parte, los estudiantes de DAM se encargarán de desarrollar un programa cliente que permitirá recibir los datos enviados desde AWS y almacenarlos en la base de datos, utilizando java. Este componente será crucial para asegurar la integración y el flujo de datos entre los dispositivos IoT y la base de datos central.

Finalmente, el estudiante de DAW se concentrará en la creación de una API REST que gestionará la base de datos relacional. Esta API será diseñada para permitir, como mínimo, consultas relacionadas con los registros de entrada y salida, así como información de las personas. Su desarrollo será clave para proporcionar acceso estructurado y seguro a los datos almacenados, facilitando la interacción con otras aplicaciones del sistema.

Este sprint consolidará la base técnica del proyecto y permitirá avanzar hacia un sistema funcional y bien integrado, gracias a la colaboración entre los cinco miembros del equipo y a la división eficiente de las responsabilidades según sus competencias.

Pueden acceder al Kanban de este tercer sprint a través del siguiente enlace: [Trello Kanban Sprint 3](https://trello.com/invite/b/673b459a95f41a68a4d3e2cd/ATTI30e02176b3708ad6e822da540ceaf7e2B91587A0/a02-4-sprint-3), donde podrán seguir el progreso de las tareas asignadas.

---

**app.py**

Este archivo define la API REST utilizando FastAPI para gestionar las operaciones CRUD sobre los usuarios almacenados en la base de datos PostgreSQL. Conecta con la base de datos usando `psycopg2`, y define varios endpoints como:
- GET `/api/usuaris`: Recupera todos los usuarios.
- GET `/api/usuaris/{id}`: Obtiene un usuario específico por ID.
- POST `/api/usuaris`: Crea un nuevo usuario.
- PUT `/api/usuaris/{id}`: Actualiza los detalles de un usuario existente.
- DELETE `/api/usuaris/{id}`: Elimina un usuario por ID.
Este archivo permite interactuar con la base de datos PostgreSQL de manera sencilla y efectiva usando las capacidades de FastAPI para crear una API rápida y escalable.

![Marcador de Asistencia](<Sprint-3/Capturas/app.png>)

**arduino-aws**

Este es el código de un Arduino (en este caso, un ESP32) que se conecta a AWS IoT Core utilizando MQTT para enviar datos al servidor en la nube. Los datos son enviados de forma periódica (cada 5 segundos) con el siguiente flujo:
- Conexión a WiFi local.
- Establecimiento de una conexión segura con AWS IoT Core utilizando certificados para autenticar el dispositivo.
- Publicación de datos (como valores de sensores) a un topic en AWS IoT.
El código utiliza la librería `PubSubClient` para la comunicación MQTT y asegura la transmisión mediante `WiFiClientSecure`, utilizando el protocolo SSL/TLS.

![Marcador de Asistencia](<Sprint-3/Capturas/arduino-aws.png>)

**datos-aws-postgres.java**

Este archivo contiene el código en Java para manejar los datos recibidos desde AWS IoT. Utiliza el AWS IoT Device SDK para suscribirse a un topic en AWS IoT Core y recibir los mensajes enviados por el Arduino. Cuando el mensaje es recibido:
- El payload es extraído y parseado.
- Los datos (como un `sensor_id` y su `valor`) se insertan en una base de datos PostgreSQL.
La clase también implementa el manejo de conexiones MQTT y la inserción de datos en la base de datos usando JDBC, específicamente mediante un PreparedStatement para evitar inyecciones SQL.

![Marcador de Asistencia](<Sprint-3/Capturas/datos-aws-postgres.png>)

**dependencias-maven.txt**

Este archivo contiene las dependencias necesarias para el proyecto en Java. Se incluyen:
- AWS IoT Device SDK: Para interactuar con AWS IoT Core mediante MQTT.
- PostgreSQL JDBC: Para conectar y realizar operaciones sobre una base de datos PostgreSQL.
Estas dependencias se gestionan a través de Maven, el sistema de gestión de dependencias de Java, para facilitar la configuración del entorno y asegurar que las bibliotecas necesarias se descarguen automáticamente.

![Marcador de Asistencia](<Sprint-3/Capturas/Dependecias-maven.png>)

**docker-compose.yml**

Este archivo configura los contenedores necesarios para ejecutar el proyecto usando Docker Compose. Define dos servicios principales:
- db: Utiliza la imagen oficial de PostgreSQL para levantar la base de datos con el nombre `proyecto`. Define las credenciales de acceso y asegura la persistencia de datos mediante volúmenes.
- app: Construye el contenedor de la aplicación que ejecuta la API FastAPI. Establece la conexión a la base de datos PostgreSQL y expone el puerto 8000 para acceder a la API.
Este archivo permite que todos los servicios necesarios (API y base de datos) se gestionen de manera eficiente mediante Docker, asegurando una configuración de entorno reproducible.

![Marcador de Asistencia](<Sprint-3/Capturas/docker-compose.png>)

**Dockerfile**

El archivo Dockerfile establece cómo se construye la imagen del contenedor para la aplicación. Los pasos principales incluyen:
1. Usar la imagen base python:3.10-slim.
2. Establecer el directorio de trabajo a `/app`.
3. Copiar los archivos del proyecto dentro del contenedor.
4. Instalar las dependencias necesarias a partir del archivo `requirements.txt`.
5. Exponer el puerto 8000 para que la aplicación FastAPI sea accesible.
6. Definir el comando para ejecutar Uvicorn y servir la aplicación FastAPI.
Este archivo es esencial para automatizar la construcción y ejecución de la aplicación en un entorno aislado usando Docker.

![Marcador de Asistencia](<Sprint-3/Capturas/Dockerfile.png>)

**init.sql**

Este archivo contiene el script SQL necesario para inicializar la base de datos PostgreSQL con las tablas requeridas para el proyecto. Crea las siguientes tablas:
- rol: Define los roles disponibles para los usuarios.
- clase: Contiene las clases disponibles en el sistema.
- usuaris: La tabla principal de usuarios, que incluye referencias a rol y clase.
- historialcambios: Registra cambios en los usuarios.
- registre: Registra las acciones realizadas por los usuarios.
- tablahorarios: Almacena los horarios de las clases.
Este script es necesario para configurar la base de datos con la estructura adecuada antes de ejecutar la aplicación.

![Marcador de Asistencia](<Sprint-3/Capturas/init.png>)

**politica-aws**

Este archivo JSON define la política de permisos para AWS IoT Core. La política permite que un dispositivo (en este caso, un Arduino o ESP32) pueda:
- Conectarse a AWS IoT Core.
- Publicar datos en un tema específico de MQTT.
La política es esencial para garantizar que el dispositivo tenga los permisos necesarios para interactuar de manera segura con AWS IoT.

![Marcador de Asistencia](<Sprint-3/Capturas/politica-aws.png>)

**requirements.txt**

Este archivo contiene las dependencias necesarias para ejecutar la API FastAPI. Incluye:
- fastapi: Framework para la construcción de la API REST.
- uvicorn: Servidor ASGI para ejecutar la aplicación FastAPI.
- psycopg2-binary: Adaptador PostgreSQL para Python, utilizado para conectar y realizar operaciones sobre la base de datos PostgreSQL.
Este archivo es esencial para configurar el entorno de Python y asegurar que las librerías necesarias estén instaladas.

![Marcador de Asistencia](<Sprint-3/Capturas/requirements.png>)

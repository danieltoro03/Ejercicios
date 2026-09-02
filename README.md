# Ejercicios

Taller de nivelación PI a PII

Parte Teórica

Investigar que es markdown

R// Es un lenguaje de marcado ligero que permite dar formato a texto plano usando símbolos sencillos en lugar de botones o menús complejos.

GIT: 

1. ¿Qué es un repositorio en Git y cómo se diferencia de un proyecto“normal”?

Un repositorio en Git guarda todo el historial de cambios y permite volver al pasado o probar cosas en ramas sin riesgo, mientras que un proyecto "normal" solo conserva el estado actual de la carpeta y sobrescribe el trabajo previo.

2. ¿Cuáles son las tres áreas principales de Git (working directory, staging area index y repository) y qué papel cumple cada una?

Las tres áreas principales son el Working Directory, que es la carpeta donde editas tus archivos; el Staging Area, una zona intermedia donde seleccionas y preparas los cambios específicos que quieres guardar; y el Repository, la base de datos permanente donde esos cambios se confirman y almacenan definitivamente en el historial.

3. ¿Cómo representa Git los cambios internamente? (objetos blob, tree, commit y tag)

Git representa todo mediante cuatro objetos: el blob guarda el contenido del archivo, el tree la estructura de carpetas, el commit la foto instantánea con autor y mensaje, y el tag una etiqueta fija para marcar versiones.

4. ¿Cómo se crea un commit y qué información almacena un objeto commit?

Se crea con git commit -m "mensaje" y almacena la foto del proyecto (puntero a un tree), el autor, la fecha, el mensaje y el identificador del commit anterior.

5. ¿Cuál es la diferencia entre git pull y git fetch?

git fetch solo descarga los cambios del servidor sin modificar tus archivos, mientras que git pull los descarga y los fusiona de inmediato en tu rama actual.

6. ¿Qué es un branch (rama) en Git y cómo Git gestiona los punteros a commits?

Una rama es solo un puntero móvil que apunta a un commit específico, y Git gestiona estos punteros actualizando automáticamente el puntero especial HEAD hacia la rama actual para moverla al nuevo commit cada vez que guardas cambios.

7. ¿Cómo se realiza un merge y qué conflictos pueden surgir? ¿Cómo se resuelven?

Un merge une ramas con git merge; si modificaron la misma línea hay conflicto, el cual se resuelve editando el archivo a mano y haciendo un commit.

8. ¿Cómo funciona el área de staging (git add) y qué pasa si omito este paso?

git add prepara los cambios para el guardado; si lo omites, git commit no registrará ninguna de tus modificaciones en el historial.

9. ¿Qué es el archivo .gitignore y cómo influye en el seguimiento de archivos?

Es un archivo de texto donde listas los archivos o carpetas que Git debe ignorar por completo para no rastrearlos ni subirlos al repositorio.

10. ¿Cuál es la diferencia entre un “commit amend” (--amend) y un nuevo commit?

git commit --amend reemplaza el último commit modificando su contenido o mensaje, mientras que un nuevo commit añade un registro adicional al historial.

11. ¿Cómo se utiliza git stash y en qué escenarios es útil?

git stash guarda tus cambios no confirmados en un borrador temporal para limpiar tu área de trabajo, siendo útil cuando necesitas cambiar de rama urgentemente sin perder lo que estabas haciendo.

12. ¿Qué mecanismos ofrece Git para deshacer cambios (por ejemplo, git reset, git revert, git checkout)?

Git ofrece git reset para borrar commits o deshacer cambios moviendo la rama al pasado, git revert para crear un nuevo commit que anula los efectos de uno anterior de forma segura, y git checkout para descartar modificaciones en un archivo o cambiar de rama.

13. ¿Cómo funciona la configuración de remotos (origin, upstream) y qué comandos uso para gestión de forks?

Un remoto conecta el repositorio local con otro en la nube; origin corresponde a la copia personal del usuario (su fork) y upstream al repositorio original del proyecto desde el cual se obtienen actualizaciones y al que se envían contribuciones.

14. ¿Cómo puedo inspeccionar el historial de commits (por ejemplo, git log, git diff, git show)?

El historial de commits se inspecciona con git log para listar la cronología de cambios, git show para examinar el detalle exacto de un commit específico y git diff para comparar las diferencias entre distintas versiones o archivos antes de guardar.




Programación:



15. ¿Cuáles son los tipos de datos primitivos en Java?

Son ocho: byte, short, int, long, float, double, char y boolean.

16. ¿Cómo funcionan las estructuras de control de flujo como if, else, switch y bucles en Java?

Permiten controlar la ejecución del código: if/else evalúan condiciones booleanas, switch selecciona bloques según un valor, y los bucles (for, while, do-while) repiten instrucciones mientras se cumpla una condición.

17. ¿Por qué es importante usar nombres significativos para variables y métodos?

Facilita la lectura del código, aclara la intención de la regla de negocio sin requerir comentarios y simplifica el mantenimiento a futuro.

18. ¿Qué es la Programación Orientada a Objetos (POO)?

Es un paradigma de programación basado en organizar el código en objetos que agrupan datos (atributos) y comportamientos (métodos).

19. ¿Cuáles son los cuatro pilares de la Programación Orientada a Objetos?

Son encapsulamiento, abstracción, herencia y polimorfismo.

20. ¿Qué es la herencia en POO y cómo se utiliza en Java?

Permite a una clase adquirir atributos y métodos de otra mediante la palabra clave extends, facilitando la reutilización de código y el establecimiento de jerarquías.

21. ¿Qué son los modificadores de acceso y cuáles son los más comunes en Java?

Son palabras clave que regulan la visibilidad de clases, métodos y variables; los principales son `public` (acceso total), `private` (solo en la misma clase), `protected` (misma clase, paquete y subclases) y por defecto o *package-private* (solo dentro del mismo paquete).

22. ¿Qué es una variable de entorno y por qué son importantes para Java o la programación en general?

Una variable de entorno es un valor del sistema operativo que guarda configuraciones (como `JAVA_HOME` o credenciales), permitiendo cambiar el comportamiento del programa sin tocar el código fuente para mayor seguridad y portabilidad.

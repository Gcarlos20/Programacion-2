# Programacion 2

> Repositorio dedicado al desarrollo y ejercicios de programacion 2

--

# 1. ¿Qué es un repositorio en Git y cómo se diferencia de un proyecto “normal”?
    > Un repositorio Git es un espacio donde se almacena un proyecto junto con el historial de versiones y cambios realizados sobre sus archivos. Se diferencia >de un proyecto normal porque permite controlar, registrar y recuperar diferentes versiones del proyecto.

# 2 Cuáles son las tres áreas principales de Git (working directory, staging area/index y repository) y qué papel cumple cada una?

    > Las tres áreas principales de Git son el Working Directory, el Staging Area o Index y el Repository. El Working Directory es la carpeta donde se  encuentran los archivos del proyecto y donde se realizan los cambios. El Staging Area es el espacio donde se seleccionan y preparan los cambios que se desean incluir en el siguiente commit, utilizando el comando git add. Finalmente, el Repository es donde Git almacena de forma permanente el historial de cambios registrados mediante los commits.

# 3 ¿Cómo representa Git los cambios internamente? (objetos blob, tree, commit y tag)
    > Git representa los cambios mediante diferentes tipos de objetos internos. Los principales son blob, tree, commit y tag. Un blob almacena el contenido de un   
    archivo, pero no guarda directamente su nombre. Un tree organiza los archivos y directorios, relacionando sus nombres con los objetos blob correspondientes. Un commit representa una versión concreta del proyecto, guardando información como quién realizó el cambio, cuándo se hizo, el mensaje del commit y la referencia al tree que contiene esa versión. Finalmente, un tag es una etiqueta que permite identificar de manera sencilla un commit específico, normalmente para marcar versiones importantes del proyecto, como v1.0 o v2.0.

#  4 . ¿Cómo se crea un commit y qué información almacena un objeto commit?
    >Un commit se crea después de preparar los cambios en el área de staging utilizando el comando git commit -m "mensaje". Primero se realizan los cambios en el Working Directory, luego se agregan al Staging Area con git add y finalmente se crea el commit. Un objeto commit almacena información sobre una versión específica del proyecto, como el autor, la fecha y hora, el mensaje del commit, una referencia al objeto tree que contiene los archivos de esa versión y la referencia al commit anterior. De esta manera, Git puede mantener y reconstruir el historial de cambios del proyecto.

# 5. ¿Cuál es la diferencia entre git pull y git fetch?
    >La diferencia entre git pull y git fetch es que ambos obtienen información actualizada del repositorio remoto, pero actúan de manera diferente. git fetch descarga los nuevos cambios y commits del repositorio remoto, pero no modifica los archivos de la rama en la que estás trabajando. En cambio, git pull descarga los cambios del repositorio remoto y además los integra automáticamente en tu rama local, normalmente mediante un merge o rebase. En resumen, git fetch permite revisar los cambios antes de integrarlos, mientras que git pull los descarga y los integra directamente.

# 6 ¿Qué es un branch (rama) en Git y cómo Git gestiona los punteros a commits? 
    >Un **branch o rama** en Git es una línea independiente de desarrollo que permite trabajar en diferentes versiones de un proyecto sin afectar directamente la rama principal. Git gestiona las ramas mediante **punteros o referencias que apuntan a commits específicos**. Cuando se realiza un nuevo commit, el puntero de la rama avanza automáticamente hacia ese nuevo commit. Además, Git utiliza el puntero **`HEAD`** para indicar la rama o commit en el que se encuentra actualmente el usuario. Esto permite crear, cambiar y combinar ramas de manera sencilla sin duplicar todos los archivos del proyecto.

# 7 Cómo se realiza un merge y qué conflictos pueden surgir? ¿Cómo se resuelven?
    > Un merge en Git se realiza para integrar los cambios de una rama en otra. Primero se cambia a la rama que recibirá los cambios, por ejemplo, main, y luego se ejecuta git merge nombre-rama. Si los cambios de ambas ramas no se contradicen, Git los integra automáticamente. Sin embargo, puede surgir un conflicto cuando dos ramas modifican de manera diferente la misma parte de un archivo. Para resolverlo, se debe abrir el archivo en conflicto, decidir qué cambios conservar o combinar, eliminar las marcas de conflicto, guardar el archivo y después ejecutar git add y git commit para finalizar el merge.

# 8 ¿Cómo funciona el área de staging (git add) y qué pasa si omito este paso?
    >El área de staging es una zona intermedia donde Git prepara los cambios que se van a incluir en el próximo commit. Cuando se utiliza git add, los cambios seleccionados pasan del Working Directory al Staging Area, permitiendo elegir exactamente qué modificaciones se quieren guardar en el historial. Luego, con git commit, Git registra esos cambios en el repositorio.

# 9 ¿Qué es el archivo .gitignore y cómo influye en el seguimiento de archivos?
    >El archivo .gitignore es un archivo de configuración que indica a Git qué archivos o carpetas debe ignorar y no incluir en el seguimiento del repositorio. Se utiliza principalmente para evitar subir archivos innecesarios, temporales o que contengan información sensible, como archivos de configuración, contraseñas, carpetas generadas por los IDE o dependencias.

# 10  ¿Cuál es la diferencia entre un “commit amend” (--amend) y un nuevo commit?
    >La diferencia es que un **commit --amend** permite **modificar el último commit existente**, mientras que un **nuevo commit** crea un registro completamente nuevo en el historial. Con git commit --amend se pueden corregir archivos o modificar el mensaje del último commit sin crear otro commit adicional. En cambio, al realizar un nuevo `git commit`, Git agrega una nueva versión al historial manteniendo el commit anterior. El `--amend` se utiliza principalmente para corregir errores o agregar cambios que olvidamos incluir en el último commit.

# 11 ¿Cómo se utiliza git stash y en qué escenarios es útil?
    >git stash se utiliza para guardar temporalmente los cambios que tienes en tu Working Directory sin hacer un commit. Esto permite dejar el proyecto limpio para realizar otra tarea y posteriormente recuperar esos cambios.

# 12 . ¿Qué mecanismos ofrece Git para deshacer cambios (por ejemplo, git reset, git revert, git checkout)
    > Git ofrece varios mecanismos para deshacer cambios, dependiendo de qué se quiera modificar. git reset permite mover el puntero de la rama hacia otro commit y puede utilizarse para quitar cambios del staging o eliminar commits del historial local. git revert crea un nuevo commit que deshace los cambios realizados por un commit anterior, por lo que es una opción segura cuando el historial ya fue compartido con otros. Por otro lado, git checkout permite cambiar de rama y, en versiones tradicionales de Git, también recuperar archivos o estados anteriores. En resumen, reset modifica el historial, revert conserva el historial creando un nuevo commit y checkout se utiliza principalmente para cambiar de rama o recuperar versiones anteriores de archivos.

# 13  . ¿Cómo funciona la configuración de remotos (origin, upstream) y qué comandos uso para gestión de forks?

    >Los remotos en Git permiten conectar el repositorio local con repositorios alojados en plataformas como GitHub. El remoto origin suele ser el repositorio principal desde el cual se clona o al que se suben los cambios. En el caso de un fork, normalmente origin apunta al repositorio propio y upstream apunta al repositorio original del que se creó el fork.

# 14 Cómo puedo inspeccionar el historial de commits (por ejemplo, git log, git diff, git show)? 
    > Git permite inspeccionar el historial y los cambios mediante varios comandos. git log muestra la lista de commits realizados, incluyendo información como el autor, la fecha y el mensaje. git diff permite comparar cambios entre archivos, commits o estados del proyecto, mostrando qué líneas fueron agregadas, modificadas o eliminadas. Por otro lado, git show permite consultar los detalles de un commit específico, incluyendo los cambios realizados en ese commit.


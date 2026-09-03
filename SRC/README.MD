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

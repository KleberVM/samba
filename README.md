## Caracteristicas

- Editar el archivo de configuración del servidor Samba (smb.conf).
- Eliminar usuarios del servidor.
- Agregar usuarios al servidor.
- Agregar recursos compartidos.
- Editar los recursos compartidos.
- Eliminar los recursos compartidos.


# Servidor Samba GUI

![](https://i.ibb.co/MpJbR64/Captura-de-pantalla-2024-05-26-113803.png)

Este programa proporciona una interfaz gráfica para gestionar un servidor Samba, permitiendo la edición del archivo de configuración, la gestión de usuarios y la administración de recursos compartidos de manera visual. Es una herramienta útil para simplificar la configuración y mantenimiento de servidores Samba en entornos donde se prefiere una interfaz gráfica sobre la manipulación directa de archivos de configuración y comandos de terminal.

## Instalaciones previas

- Tener instalado el servidor Samba y el cliente Samba.
  
   `sudo apt install samba samba-client`

- Tener instalado Java.

 	 `sudo apt install default-jre`
  
- Tener instalado o actualizado Java-11-openjdk-devel para compilar el programa.

  `sudo apt install openjdk-11-jdk`

## Código del Programa
### Mainn.java
#### Elimina un recurso compartido modificando smb.conf.
```Java
public void eliminarSeccion(String archivo, String seccion){
	//codigo en la clase mainn
}
```
#### Edita el archivo smb.conf agregando el nuevo contenido.
```Java
public void editarTxt(String contenido, String ubicacion){
	//codigo en la clase mainn
}
```
#### Edita el archivo smb.conf, agrega una opción o atributo si no existe; de lo contrario, lo edita con el nuevo contenido. Cambia el nombre de la sección si los parámetros seccion y atributo coinciden, sustituyéndolos por el contenido.
```Java
public editarAtributo(String ubicacionArchivo, String seccion, String atributo, String contenido){
	//codigo en la clase mainn
}
```
#### Devuelve una matriz separada por = o :
```Java
public ArrayList<ArrayList<String>> dividir(ArrayList<String> aux, char separador){
	//codigo en la clase mainn
}
```
#### Cambia el estado de “#” para que esté inhabilitado o "" para que esté habilitado.
```Java
public cambiarEstado(String ubicacionArchivo, String seccion){
	//codigo en la clase mainn
}
```
#### Retorna una lista de todo el contenido fila por fila del archivo.
```Java
public ArrayList<String> getSeccion(String ubicacionArchivo, String seccion){
	//codigo en la clase mainn
}
```
#### Borra todo el contenido del archivo.
```Java
public clearTxt(String ubicacion){
	//codigo en la clase mainn
}
```
#### Retorna una lista de todo el contenido del archivo smb.conf.
```Java
public ArrayList<String> getTxt(String ubicacion){
	//codigo en la clase mainn
}
```
#### Retorna "activo" si el servicio Samba está corriendo, de lo contrario retorna "inactivo".
```Java
public String leerEstado(String ubicacion){
	//codigo en la clase mainn
}
```
#### Retorna una lista de usuarios del servidor Samba.
```Java
public ArrayList<String> usuarioName(String ubicacion){
	//codigo en la clase mainn
}
```
#### Ejecuta comandos.
```Java
public void comando(String comando){
	//codigo en la clase mainn
}
```
#### Elimina un usuario Samba.
```Java
public boolean eliminarUsuarioSmb(String usuario){
	//codigo en la clase mainn
}
```
#### Crea un nuevo usuario Samba. Nota: el usuario ya debe existir en el sistema operativo.
```Java
public boolean crearUsuarioSmb(String usuario, String contraseña){
	//codigo en la clase mainn
}
```
#### Elimina el atributo u opción de la sección dada.
```Java
public void eliminarAtributo(String ubicacionArchivo, String seccion, String atributo){
	//codigo en la clase mainn
}
```
#### Retorna una lista de los recursos compartidos definidos en smb.conf.
```Java
public ArrayList<String> getRecursos(String ubicacionArchivo){
	//codigo en la clase mainn
}
```

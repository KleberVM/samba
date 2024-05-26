
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
/**
 *
 * @author kleber
 */
public class mainn {
    public void eliminarSeccion(String archivo, String seccion) throws IOException {
        String seccionAEliminar = "[" + seccion + "]";
        ArrayList<String>aux = getTxt(archivo);
        for(int i=0;i<aux.size();i++){
            if(aux.get(i).contains(seccionAEliminar)){
                aux.remove(i);
                if(i<aux.size()){
                    while(aux.get(i)!=null&&!aux.get(i).contains("[")&&!aux.get(i).contains("##")){
                        aux.remove(i);
                        if(i>=aux.size()){
                            break;
                        }
                    }
                }
                break;
            }
        }
        clearTxt(archivo);
        for(int i=0;i<aux.size();i++){
            editarTxt(aux.get(i),archivo);
        }
    }
    public void editarTxt(String contenido,String ubicacion) throws java.io.IOException {
        File aux=new File(ubicacion);
        if(aux.exists()){
            PrintWriter salida =new PrintWriter(new FileWriter(aux,true));//le decimos que escriba en esta ubicacion
            salida.println(contenido);//empieza a escribir
            salida.close();//cierra el flujo que empezamos para que no lea infinitamente
        }
    }
    public void editarAtributo(String ubicacionArchivo, String seccion, String atributo, String contenido) throws IOException{
        seccion = "[" + seccion + "]";
        ArrayList<String>aux = getTxt(ubicacionArchivo);
        for(int i=0;i<aux.size();i++){
            if(aux.get(i).contains(seccion)){
                if(seccion.contains(atributo)){
                    if(aux.get(i).contains("#")){
                        aux.set(i,"# ["+(contenido.trim())+"]");
                    }else{
                        aux.set(i,"["+(contenido.trim())+"]");
                    }
                }else{
                    boolean esta = false;
                    i=i+1;
                    if(i<aux.size()){
                        while(aux.get(i)!=null&&!aux.get(i).contains("[")&&!aux.get(i).contains("##")){
                            if(aux.get(i).contains(atributo)){
                                esta=true;
                                if(aux.get(i).contains("#")){
                                    aux.set(i,"#\t"+atributo.trim()+" = "+contenido.trim());
                                }else{
                                    aux.set(i,"\t"+atributo.trim()+" = "+contenido.trim());
                                }
                                break;
                            }
                            i=i+1;
                            if(i>=aux.size()){
                                i=aux.size()-1;
                                break;
                            }
                        }
                    }
                    if(!esta){
                            if(aux.get(i-1).contains("#")){
                                aux.add(i,"#\t"+atributo.trim()+" = "+contenido.trim());
                            }else{
                                aux.add(i,"\t"+atributo.trim()+" = "+contenido.trim());
                            }
                        }
                }
                break;
            }
        }
        clearTxt(ubicacionArchivo);
        for(int i=0;i<aux.size();i++){
            editarTxt(aux.get(i),ubicacionArchivo);
        }
    }
    public ArrayList<ArrayList<String>>dividir(ArrayList<String> aux,char separador) throws java.io.IOException{
        ArrayList<ArrayList<String>>res=new ArrayList<ArrayList<String>>();
        ArrayList<String>aux2=new ArrayList<String>();
        String n="";
        for(int i=0;i<aux.size();i++){
            for(int e=0;e<aux.get(i).length();e++){
                if(aux.get(i).charAt(e) != separador){
                    n=n+aux.get(i).charAt(e);
                    if(e==(aux.get(i).length()-1)){
                        aux2.add(n.trim());//trim se asegura que la cadena no tenga espacion al inicio ni al final "   hola  m  " return "hola m"
                        n=""; 
                    }
                }else{
                    if(n!=""){
                        aux2.add(n.trim());
                        n="";
                    }
                }
            }
            res.add(aux2);
            aux2=new ArrayList<String>();
        }
        return res;
    }
    public void cambiarEstado(String ubicacionArchivo, String seccion) throws IOException{//habilitado , inhabilitado
        seccion = "[" + seccion + "]";
        ArrayList<String>aux = getTxt(ubicacionArchivo);
        for(int i=0;i<aux.size();i++){
            if(aux.get(i).contains(seccion)){
                if(aux.get(i).contains("#")){
                    aux.set(i,aux.get(i).replace("#","").trim());
                    i=i+1;
                    while(aux.get(i)!=null&&!aux.get(i).contains("[")&&!aux.get(i).contains("##")){
                        aux.set(i,"\t"+(aux.get(i).replace("#","").trim()));
                        i=i+1;
                        if(i==aux.size()){
                            break;
                        }
                    }
                }else{
                    aux.set(i,"# "+(aux.get(i).trim()));
                    i=i+1;
                    while(aux.get(i)!=null&&!aux.get(i).contains("[")&&!aux.get(i).contains("##")){
                        aux.set(i,"#\t"+(aux.get(i).trim()));
                        i=i+1;
                        if(i==aux.size()){
                            break;
                        }
                        
                    }
                }
                break;
            }
        }
        clearTxt(ubicacionArchivo);
        for(int i=0;i<aux.size();i++){
            editarTxt(aux.get(i),ubicacionArchivo);
        }
    }
    public ArrayList<String> getSeccion(String ubicacionArchivo, String seccion)throws IOException {
        ArrayList<String>hasd = getTxt(ubicacionArchivo);
        ArrayList<String> seccionLines = new ArrayList<String>();
        boolean dentro =false;
        for(int i = 0; i<hasd.size() ;i++){
            if(hasd.get(i).contains("["+seccion+"]")){
                dentro =true;
            }else if(hasd.get(i).contains("[")&&dentro){
                dentro =false;
                break;
            }else if(hasd.get(i).contains("##")&&dentro){
                dentro =false;
                break;
            }
            if (dentro) {
                    seccionLines.add(hasd.get(i).trim());
                }
        }
        for(int i = 0; i<seccionLines.size() ;i++){
            if(seccionLines.get(i).equals("")){
                seccionLines.remove(i);
            }
        }
        return seccionLines;
    }
    public void clearTxt(String ubicacion) throws java.io.IOException {
        FileWriter escritor = new FileWriter(ubicacion);
        escritor.write("");
        escritor.close();
    }
    public ArrayList<String> getTxt(String ubicacion) throws java.io.IOException {
        ArrayList<String>lineas=new ArrayList<String>();
        File aux=new File(ubicacion);
        if(aux.exists()){
            BufferedReader entrada =new BufferedReader(new FileReader(aux));
            String lectura=entrada.readLine();
            while(lectura!=null){
                lineas.add(lectura);
                lectura=entrada.readLine();//sigue leendo
            }
            entrada.close();//que no siga
        }
        return lineas;   
    }
    public String leerEstado (String ubicacion) throws java.io.IOException {
        ArrayList<String> a =getTxt(ubicacion);
        ArrayList<String> aux2 =new ArrayList<String>();
        String status =a.get(2);
        String n ="";
        for(int e=0;e<status.length();e++){
                if(status.charAt(e)!=':'){
                    n=n+status.charAt(e);
                    if(e==(status.length()-1)){
                        aux2.add(n);
                        n=""; 
                    }
                }else{
                    if(n!=""){
                        aux2.add(n);
                        n="";
                    }
                }
            }
        return aux2.get(1);
    }
    public ArrayList<String> usuarioName(String ubicacion) throws java.io.IOException {
        ArrayList<String> a =getTxt(ubicacion);
        ArrayList<String> aux2 =new ArrayList<String>();
        String n ="";
         for(int i=0;i<a.size();i++){
            for(int e=0;e<a.get(i).length();e++){
                if(a.get(i).charAt(e)!=':'){
                    n=n+a.get(i).charAt(e);
                }else{
                    if(n!=""){
                        aux2.add(n);
                        n="";
                        break;
                    }
                }
            }
        }
        return aux2;
    }
    public void comando(String comand)throws java.io.IOException{//
        String[] comando = { "bash", "-c",comand};//"pdbedit -w -L > /home/kleber/Escritorio/kvm/holass.txt".---> ejemplo
        // Crear el proceso
        ProcessBuilder pb = new ProcessBuilder(comando);
        // Redirigir la salida de error a la salida estándar
        pb.redirectErrorStream(true);
        // Ejecutar el comando
        Process proceso = pb.start();
        // Leer la salida del proceso (opcional)
        BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
        String linea;
        while ((linea = reader.readLine()) != null) {
            System.out.println(linea);
        }
        // Esperar a que el proceso termine
        try {
            proceso.waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Cerrar el lector
        reader.close();
    }
    public boolean eliminarUsuarioSmb(String usuario)throws java.io.IOException{
        try {
        // Comando para eliminar el usuario de Samba
        String[] comando = { "smbpasswd", "-x", usuario };
        // Crear el proceso
        ProcessBuilder pb = new ProcessBuilder(comando);
        // Configurar el flujo de entrada para proporcionar la contraseña
        Process proceso = pb.start();
        // Leer la salida del proceso (opcional)
        BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
        String linea;
        while ((linea = reader.readLine()) != null) {
            System.out.println(linea);
        }
        // Esperar a que el proceso termine
        proceso.waitFor();
        // Verificar si el proceso terminó correctamente (0 indica éxito)
        int exitValue = proceso.exitValue();
        if (exitValue == 0) {
            return true; // Usuario eliminado correctamente
        } else {
            return false; // No se pudo eliminar el usuario
        }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return false; // En caso de excepción, retornar falso
        }
    }
    public boolean crearUsuarioSmb(String usuario,String contrasena){
        try {
        // Comando para agregar el usuario a Samba
        String[] comando = { "smbpasswd", "-a", usuario };
        // Crear el proceso
        ProcessBuilder pb = new ProcessBuilder(comando);
        // Configurar el flujo de entrada para proporcionar la contraseña
        Process proceso = pb.start();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(proceso.getOutputStream()));
        writer.write(contrasena);
        writer.newLine(); // Agregar una nueva línea para confirmar la contraseña
        writer.write(contrasena); // Confirmar la contraseña
        writer.newLine(); // Agregar una nueva línea
        writer.flush(); // Flushear el flujo de salida
        // Leer la salida del proceso (opcional)
        BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
        String linea;
        while ((linea = reader.readLine()) != null) {
            System.out.println(linea);
        }
        // Esperar a que el proceso termine
        proceso.waitFor();
        // Verificar si el proceso terminó correctamente (0 indica éxito)
        int exitValue = proceso.exitValue();
        if (exitValue == 0) {
            return true; // Usuario agregado correctamente
        } else {
            return false; // No se pudo agregar el usuario
        }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return false; // En caso de excepción, retornar falso
        }
    }
    public void eliminarAtributo(String ubicacionArchivo, String seccion, String atributo) throws IOException{
        seccion = "[" + seccion + "]";
        ArrayList<String>aux = getTxt(ubicacionArchivo);
        for(int i=0;i<aux.size();i++){
            if(aux.get(i).contains(seccion)){
                i=i+1;
                while(aux.get(i)!=null&&!aux.get(i).contains("[")&&!aux.get(i).contains("##")){
                    if(aux.get(i).contains(atributo)){
                        aux.remove(i);
                    }
                    i=i+1;
                    if(i>=aux.size()){
                        break;
                    }
                }
                break;
            }
        }
        clearTxt(ubicacionArchivo);
        for(int i=0;i<aux.size();i++){
            editarTxt(aux.get(i),ubicacionArchivo);
        }
        /*ArrayList<String> g = getSeccion(ubicacionArchivo,seccion);
        eliminarSeccion(ubicacionArchivo,seccion);
        for(int i =0 ; i< g.size();i++){
            //System.out.println();
            if(g.get(i).contains(atributo)){
                g.remove(i);
            }
        }
        for(int i=0;i<g.size();i++){
            editarTxt(g.get(i),ubicacionArchivo);
        }
        ordenar(ubicacionArchivo);*/
    }
    public ArrayList<String> getRecursos(String ubicacionArchivo){
        ArrayList<String> res =null;
        try{
            res = new ArrayList<String> ();
            ArrayList<String> aux = getTxt(ubicacionArchivo);
            for(int i =0;i< aux.size();i++){
                if(aux.get(i).contains("[")){
                    res.add(aux.get(i).replace("[","").replace("]",""));
                }
            }
            for(int i =0;i<res.size();i++){
                if(res.get(i).contains("#")){
                    res.set(i,res.get(i).replace("#",""));
                }
            }
            for(int i =0;i<res.size();i++){
                res.set(i,res.get(i).trim());
            }
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }
        return res;
    }
    public void pruebaBorrar(){
        System.out.println("hola mundo");
    }
}

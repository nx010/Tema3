package tema3;

enum tipo_coche{mini,utiliatirio,familiar,deportivo}
enum modo_seguro{a_terceros,a_todo_riesgo}
    
public class coche {
    
    private String modelo;
    private String color;
    private boolean metalizada;
    private String matricula;
    private tipo_coche tipocoche;
    private int fechafabricacion;
    private modo_seguro modoseguro;
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
     
    public String getColor(){
        return color;
    }    
    
    public void setColor(String color){
        this.color = color;
    }
    
    public boolean getMetalizada(){
        return metalizada;
    }
    
    public void setMetalizada(boolean metalizada){
        this.metalizada = metalizada;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public tipo_coche getTipocoche(){
        return tipocoche;
    }
    
    public void setTipocoche(tipo_coche tipocoche){
        this.tipocoche = tipocoche;
    }
    
    public int getFechafabricacion(){
        return fechafabricacion;
    }
    
    public void setFechafabricacion(int fecha_fabricacion){
        this.fechafabricacion = fecha_fabricacion;
    }
    
    public modo_seguro getModoseguro(){
        return modoseguro;
    }
    
    public void setModoseguro (modo_seguro modoseguro){
        this.modoseguro = modoseguro;
    }
    
    public void imprimecoche(){
        if(modelo!=null && color!=null && !modelo.equals("") && !color.equals("")){
            System.out.println("El modelo de coche es " + modelo + " y el color " + color);
        }else{
            System.out.println("El módelo o el color no han sido definidos");
        }
    }
    
}

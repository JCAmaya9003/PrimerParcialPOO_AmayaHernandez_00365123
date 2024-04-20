import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    private static ArrayList<Electronicos> electronicos;
    public static void main(String[] args) {
        int op,op2 = 0,numeroElectronicoBuscar;
        String a;
        Scanner sc = new Scanner(System.in);
        electronicos = new ArrayList<>();
        do {
            System.out.println("Bienvenido a ElectroMart!!!!");
            System.out.println(" ");
            System.out.println("Escoga una opcion!");
            System.out.println("1. Agregar articulos");
            System.out.println("2. Modificar articulos");
            System.out.println("3. Ver articulos");
            System.out.println("4. Salir");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    do{
                        System.out.println("Que articulo desea agregar?");
                        System.out.println("1. Telefonos");
                        System.out.println("2. Laptops");
                        op = sc.nextInt();
                        //System.out.print(" ");
                        a = sc.nextLine(); //agrege esto ya que el programa omite el nextLine de la linea 34, asi que de esta manera esta variable captura la linea y luego ya le da paso al siguiente nextLine para poder usarse, se que no es lo mas optimo pero no recuerdo el comando para esto, asi que no me mate :(
                        if(op == 1){
                            Telefono telefono = new Telefono();

                            System.out.println("Cual es la marca del telefono?");
                            telefono.setMarca(sc.nextLine());
                            System.out.println("Cual es el modelo del telefono(solo numeros)?");
                            telefono.setModelo(sc.nextInt());
                            do {
                                System.out.println("Trae chip?");
                                System.out.println("1. Si || 2. No");
                                op2 = sc.nextInt();
                                if (op2 == 1) {
                                    telefono.setChip(true);
                                } else if (op2 == 2) {
                                    telefono.setChip(false);
                                }
                            } while (op2 != 1 && op2 != 2);

                            a = sc.nextLine(); //en la linea 29 lo explico
                            System.out.println("Cuanto espacio tiene el telefono?");
                            telefono.setEspacio(sc.nextLine());
                            System.out.println("Ingrese la descripcion del telefono");
                            telefono.setDescripcion(sc.nextLine());
                            System.out.println("Precio del telefono?");
                            telefono.setPrecio(sc.nextFloat());
                            System.out.println("Cuantos telefonos se agregaran?");
                            telefono.setCantidad(sc.nextInt());
                            telefono.setTipoElectronico("Telefono");
                            electronicos.add(telefono);

                        }else if(op == 2) {

                            Laptop laptop = new Laptop();
                            laptop.setTipoElectronico("Laptop");
                            System.out.println("Cual es la marca de la laptop?");
                            laptop.setMarca(sc.nextLine());
                            System.out.println("Cual es el modelo de la laptop (solo numeros)?");
                            laptop.setModelo(sc.nextInt());
                            a = sc.nextLine(); //en la linea 29 lo explico
                            System.out.println("Cuanto espacio tiene la laptop?");
                            laptop.setEspacio(sc.nextLine());
                            System.out.println("Que CPU tiene?");
                            laptop.setCPU(sc.nextLine());
                            System.out.println("Que RAM tiene?");
                            laptop.setRam(sc.nextLine());
                            System.out.println("Que motherboard trae?");
                            laptop.setMotherboard(sc.nextLine());
                            do {
                                System.out.println("Trae bluetooth?");
                                System.out.println("1. Si || 2. No");
                                op2 = sc.nextInt();
                                if (op2 == 1) {
                                    laptop.setBluetooth(true);
                                } else if (op2 == 2) {
                                    laptop.setBluetooth(false);
                                }
                            } while (op2 != 1 && op2 != 2);
                            do {
                                System.out.println("Es touch?");
                                System.out.println("1. Si || 2. No");
                                op2 = sc.nextInt();
                                if (op2 == 1) {
                                    laptop.setTouch(true);
                                } else if (op2 == 2) {
                                    laptop.setTouch(false);
                                }
                            } while (op2 != 1 && op2 != 2);
                            a = sc.nextLine(); //en la linea 29 lo explico
                            System.out.println("Ingrese la descripcion de la laptop");
                            laptop.setDescripcion(sc.nextLine());
                            System.out.println("Precio de la laptop?");
                            laptop.setPrecio(sc.nextFloat());
                            System.out.println("Cuantas laptops se agregaran?");
                            laptop.setCantidad(sc.nextInt());
                            electronicos.add(laptop);
                        }
                    }while(op != 1 && op != 2);
                    break;

                case 2:
                    a = sc.nextLine(); //en la linea 29 lo explico
                    
                        System.out.println("Cual cuenta desea modificar(ingrese el modelo)?");
                        numeroElectronicoBuscar = sc.nextInt();
                    
                        for (Electronicos electros : electronicos) {
                            do {
                            if (numeroElectronicoBuscar == electros.getModelo()) {
                                System.out.println("Que desea cambiar?");
                                System.out.println("1. Cantidad");
                                System.out.println("2. Precio");
                                System.out.println("3. Descripcion");
                                System.out.println("4. Marca");
                                System.out.println("5. Tipo electronico");
                                System.out.println("6. Salir");
                                op2 = sc.nextInt();
                                a = sc.nextLine(); //en la linea 29 lo explico
                                switch (op2) {
                                    case 1:
                                        System.out.println("Ingrese la cantidad nueva");
                                        electros.setCantidad(sc.nextInt());
                                        break;
                                    case 2:
                                        System.out.println("Ingrese el precio nuevo");
                                        electros.setPrecio(sc.nextFloat());
                                        break;
                                    case 3:
                                        System.out.println("Ingrese la descripcion nueva");
                                        electros.setDescripcion(sc.nextLine());
                                        break;
                                    case 4:
                                        System.out.println("Ingrese la marca nueva");
                                        electros.setMarca(sc.nextLine());
                                        break;
                                    case 5:
                                        System.out.println("Ingrese el tipo electronico del producto");
                                        electros.setTipoElectronico(sc.nextLine());
                                        break;
                                    case 6:
                                        System.out.println("Volviendo al menu principal...");
                                        break;
                                    default:
                                        System.out.println("ERROR!");
                                        break;
                                }
                            }
                        }while(op2 != 6);
                    }
                    break;
                case 3:
                    int i = 1;
                    for (Electronicos electros : electronicos){
                        System.out.println("-------------Electronico #"+ i + "----------------");
                        System.out.println("Tipo de electronico:" + electros.getTipoElectronico());
                        System.out.println("Marca: " + electros.getMarca());
                        System.out.println("Modelo: " + electros.getModelo());
                        System.out.println("Espacio: " + electros.getEspacio());
                        System.out.println("Precio: $" + electros.getPrecio());
                        System.out.println("Descripcion: " + electros.getDescripcion());
                        System.out.println("Cantidad: " + electros.getCantidad());
                        i++;
                    }


                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("ERROR!");
                    break;
            }

        }while(op != 4);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainSolidKP;

import com.jos.dem.solid.dip.Person;
import com.jos.dem.solid.dip.PersonMemoryRepository;
import com.jos.dem.solid.dip.PersonRepository;
import com.jos.dem.solid.dip.PersonService;
import com.jos.dem.solid.isp.ContractorImpl;
import com.jos.dem.solid.isp.PartnerImpl;
import com.jos.dem.solid.lsp.PersonaHijoDos;
import com.jos.dem.solid.lsp.PersonaHijoUno;
import com.jos.dem.solid.lsp.PersonaPadre;
import com.jos.dem.solid.ocp.Engineer;
import com.jos.dem.solid.ocp.Manager;
import com.jos.dem.solid.ocp.Salesman;
import com.jos.dem.solid.srp.DueñoAnimales;

/**
 *
 * @author Karen.Pena
 */
public class ImplementacionSolid implements IPrincipiosSolid {

    //main
    public static void main(String[] args) {

        System.out.println("------PRINCIPIOS SOLID------");
        System.out.println("----------------------------");
        System.out.println("KAREN PEÑA - MARLON CAMACHO");
        System.out.println("----------------------------\n\n");

        ImplementacionSolid implementacionSolid = new ImplementacionSolid();
        implementacionSolid.mostrarPrincipioResponsabilidadUnica();
        implementacionSolid.mostrarPrincipioAbiertoCerrado();
        implementacionSolid.mostrarPrincipioLiskov();
        implementacionSolid.mostrarPrincipioSegregacionInterfaces();
        implementacionSolid.mostrarPrincipioInversionDependencias();

    }

    //Sobrecarga
    @Override
    public void mostrarPrincipioResponsabilidadUnica() {
        System.out.println("=//=============//===============//======//===============//======\n\n");
        System.out.println("PRINCIPIO RESPONSABILIDAD UNICA:\n");
        obtenerDatosDueño();

    }

    @Override
    public void mostrarPrincipioAbiertoCerrado() {
        System.out.println("=//=============//===============//======//===============//======\n\n");
        System.out.println("PRINCIPIO ABIERTO/CERRADO:\n");
        obtenerSalariosEmpleados();

    }

    @Override
    public void mostrarPrincipioLiskov() {
        System.out.println("=//=============//===============//======//===============//======\n\n");
        System.out.println("PRINCIPIO PRINCIPIO DE LISKOV:\n");
        obtenerDatosPadre();
        obtenerDatosHijoUno();
        obtenerDatosHijoDos();

    }

    @Override
    public void mostrarPrincipioSegregacionInterfaces() {
        System.out.println("=//=============//===============//======//===============//======\n\n");
        System.out.println("PRINCIPIO SEGREGACION DE INTERFACES:\n");
        obtenerDatosContratista(10);
        obtenerDatosCompañero(7);

    }

    @Override
    public void mostrarPrincipioInversionDependencias() {
        System.out.println("=//=============//===============//======//===============//======\n\n");
        System.out.println("PRINCIPIO INVERSION DE DEPENDANCIAS:\n");

        obtenerDatosPersonasServicio();
        obtenerDatosPersonasMemoriaRepo();
    }

    //propios S
    void obtenerDatosDueño() {

        DueñoAnimales tatiana = new DueñoAnimales();

        System.out.println("Hola mi nombre es " + " " + tatiana.getNombre() + " " + "tengo" + " "
                + tatiana.getEdad() + " " + "Años y amo los animales tengo dos mascotas que son:\n\n");

        tatiana.obtenerMascotaGato();
        System.out.println("\n");
        tatiana.obtenerMascotaPerro();

    }

    //propios O
    void obtenerSalariosEmpleados() {

        System.out.println("\nSalarios Empleados:");
        System.out.println("----------------------------");
        obtenerSalariosIngeniero();
        System.out.println("----------------------------");
        obtenerSalariosManager();
        System.out.println("----------------------------");
        obtenerSalarioVendedor();

    }

    void obtenerSalariosIngeniero() {
        Engineer ingeniero = new Engineer();
        System.out.println("El ingeniero gana:" + ingeniero.getPaymentAmount());

    }

    void obtenerSalariosManager() {
        Manager mamager = new Manager();
        System.out.println("El manager gana:" + mamager.getPaymentAmount());

    }

    void obtenerSalarioVendedor() {
        Salesman vendedor = new Salesman();
        System.out.println("El vendedor gana:" + vendedor.getPaymentAmount() + "\n\n");

    }

    //propios L
    void obtenerDatosPadre() {
        PersonaPadre padre = new PersonaPadre();

        System.out.println("Soy el padre y mi nombre es:" + " " + padre.getNombre() + " "
                + "mi color de ojos es:" + padre.getColorOjos() + "," + " " + String.format(" tengo:%s Años", padre.getEdad())
                + " " + "y" + " " + padre.getProfesionEstudiada() + "\n\n");

    }

    void obtenerDatosHijoUno() {
        PersonaPadre padre = new PersonaPadre();

        PersonaHijoUno hijoUno = new PersonaHijoUno();

        System.out.println("Soy la hija, mi nombre es:" + " " + hijoUno.getNombre() + " "
                + "mi color de ojos es:" + hijoUno.getColorOjos() + "," + hijoUno.musicaFavorita()
                + " " + hijoUno.profesion() + "\n\n");

    }

    void obtenerDatosHijoDos() {
        PersonaPadre padre = new PersonaPadre();

        PersonaHijoDos hijoDos = new PersonaHijoDos();

        System.out.println("Soy el  hijo, mi nombre es:" + " " + hijoDos.getNombre() + " "
                + "mi color de ojos es:" + hijoDos.getColorOjos() + "al igual que mi padre y mi hermana" + ","
                + hijoDos.musicaFavorita()
                + " " + hijoDos.profesion() + "\n\n");

    }

    //I
    void obtenerDatosContratista(int horas) {
        ContractorImpl contratista = new ContractorImpl(horas);

        System.out.println("soy el contratista y mi salario base es:" + " " + contratista.getBaseAmount() + " "
                + "mi comision es:" + contratista.getBonus());
    }

    void obtenerDatosCompañero(int horas) {
        PartnerImpl compañero = new PartnerImpl(horas);

        System.out.println("soy el compañero del contratista  y mi salario base es:" + " " + compañero.getBaseAmount() + " "
                + "mi comision es:" + compañero.getProfits());
    }

    //D
    void obtenerDatosPersonasServicio() {

        PersonRepository personRepository = new PersonMemoryRepository();
        personRepository.findAll();

        PersonService servicioPersonas = new PersonService();
        servicioPersonas.setPersonRepository(personRepository);

        servicioPersonas.getAll().forEach((persona) -> {
            System.out.println("soy:" + persona.getNickname() + " " + "desde el servicio de peronas");
        });

    }

    void obtenerDatosPersonasMemoriaRepo() {

        PersonMemoryRepository servicioPersonas = new PersonMemoryRepository();
        servicioPersonas.findAll();

        servicioPersonas.findAll().forEach((persona) -> {
            System.out.println("soy:" + persona.getNickname() + " " + "desde el repo de peronas");
        });

    }
}

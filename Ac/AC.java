/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ac;

/**
 *
 * @author LENOVO
 */
public class AC implements InterfaceAc {

    int statusAC;
    int statussuhuAc;

    public void hidupkan() {
        if (statusAC == KEADAAN_MATI_AC) {
            statusAC = KEADAAN_HIDUP_AC;
            System.out.println("Hidupkan Ac --> Ac Hidup");
        } else {
            System.out.println("Hidupkan Ac --> Ac sudah Hidup kok!!!");
        }
    }

    public void matikan() {
        if (statusAC == KEADAAN_HIDUP_AC) {
            statusAC = KEADAAN_MATI_AC;
            System.out.println("Matikan Ac --> Ac Mati");
        } else {
            System.out.println("Matikan Ac --> Ac sudah Mati kok!!!");
        }
    }

    public void dinginkan() {
        if (statussuhuAc == KEADAAN_PANAS_AC) {
            statussuhuAc = KEADAAN_DINGIN_AC;
            System.out.println("Dinginkan Ac --> Ac didinginkan");
        } else {
            System.out.println("Dinginkan Ac --> Ac sudah didinginkan kok!!!");
        }
    }

    public void panaskan() {
        if (statussuhuAc == KEADAAN_DINGIN_AC) {
            statussuhuAc = KEADAAN_PANAS_AC;
            System.out.println("Panaskan Ac --> Ac dipanaskan");
        } else {
            System.out.println("Panaskan Ac --> Ac sudah dipanaskan kok!!!");
        }
    }

}

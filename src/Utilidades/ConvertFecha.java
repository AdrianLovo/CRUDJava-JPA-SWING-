/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Adrian
 */
public class ConvertFecha {

    public static Date Convertir(Date date) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String s = df.format(date);
        String result = s;
        try {
            date = df.parse(result);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}

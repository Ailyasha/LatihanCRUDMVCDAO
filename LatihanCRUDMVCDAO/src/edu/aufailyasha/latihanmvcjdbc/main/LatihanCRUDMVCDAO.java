/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.aufailyasha.latihanmvcjdbc.main;

import edu.aufailyasha.latihanmvcjdbc.database.KingsBarbershopDatabase;
import edu.aufailyasha.latihanmvcjdbc.entity.Pelanggan;
import edu.aufailyasha.latihanmvcjdbc.error.PelangganException;
import edu.aufailyasha.latihanmvcjdbc.service.PelangganDao;
import java.sql.SQLException;

/**
 *
 * @author Ailyasha
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        
        PelangganDao dao = KingsBarbershopDatabase.getPelangganDao();
        Pelanggan pelanggan = new Pelanggan();
        pelanggan.setNama("Aufa Ilyasha");
        pelanggan.setAlamat("Tubagus Ismail");
        pelanggan.setTelp("0821 666 1313 ");
        pelanggan.setEmail("aufa.ilyasha@gmail.com");
    
        dao.insertPelanggan(pelanggan);
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositorys;

import DomainModel.ChucVu;
import java.util.List;

/**
 *
 * @author ongbi
 */
public interface IChucVuRepository {
    List<ChucVu> getAll();
    
    boolean SaveOrUpdate(ChucVu cv);
    
    boolean delete(ChucVu cv);
}

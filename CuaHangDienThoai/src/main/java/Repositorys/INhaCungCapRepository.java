/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositorys;

import DomainModel.NhaCungCap;
import java.util.List;

/**
 *
 * @author ongbi
 */
public interface INhaCungCapRepository {
      List<NhaCungCap> getAll();
    
    boolean SaveOrUpdate(NhaCungCap nhaCungCap);
    boolean khoiPhuc(NhaCungCap nhaCungCap);
    boolean delete(NhaCungCap nhaCungCap);
}

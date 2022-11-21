/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModel.QLNhaCungCap;
import java.util.List;

/**
 *
 * @author ongbi
 */
public interface INhaCungCapService {

    List<QLNhaCungCap> getAll();

    String save(QLNhaCungCap qlncc);

    String update(QLNhaCungCap qlncc);
    
    String khoiPhuc(QLNhaCungCap qlncc);

    String delete(QLNhaCungCap qlncc);
}

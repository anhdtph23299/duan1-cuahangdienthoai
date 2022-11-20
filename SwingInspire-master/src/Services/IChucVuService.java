/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModel.QlChucVu;
import java.util.List;

/**
 *
 * @author ongbi
 */
public interface IChucVuService {
    List<QlChucVu> getAll();

    String save(QlChucVu qLCv);
    
    String update(QlChucVu qLCv);

    String delete(QlChucVu qLCv);
}

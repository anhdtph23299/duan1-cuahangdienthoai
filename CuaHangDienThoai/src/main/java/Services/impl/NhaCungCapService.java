/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModel.NhaCungCap;
import Repositorys.INhaCungCapRepository;
import Repositorys.impl.NhaCungCapRepository;
import Services.INhaCungCapService;
import ViewModel.QLNhaCungCap;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ongbi
 */
public class NhaCungCapService implements INhaCungCapService{
   private  List<QLNhaCungCap> listNcc;
   private INhaCungCapRepository iNhaCungCapRepository;
    public NhaCungCapService() {
        iNhaCungCapRepository = new NhaCungCapRepository();
        listNcc = new ArrayList<>();
    }
 
    @Override
    public List<QLNhaCungCap> getAll() {
     listNcc.clear();
     listNcc = new ArrayList<>();
        for (NhaCungCap nhaCungCap : iNhaCungCapRepository.getAll()) {
            QLNhaCungCap qlncc = new QLNhaCungCap(nhaCungCap.getId(), nhaCungCap.getMa(), nhaCungCap.getDiaChi(), nhaCungCap.getTen(), nhaCungCap.getSdt(), nhaCungCap.getEmail(), nhaCungCap.getTrangThai());
             listNcc.add(qlncc);
        }
        return listNcc;
    }

    @Override
    public String save(QLNhaCungCap qlncc) {
       NhaCungCap nhaCungCap = new  NhaCungCap(null, qlncc.getMa(), qlncc.getDiaChi(), qlncc.getTen(), qlncc.getSdt(), qlncc.getEmail(), qlncc.getTrangThai());
       if(iNhaCungCapRepository.SaveOrUpdate(nhaCungCap)){
         return "Save compelte";
       }
       else{
       return "Save fail";
       }
    }

    @Override
    public String update(QLNhaCungCap qlncc) {

 NhaCungCap nhaCungCap = new  NhaCungCap(qlncc.getId(), qlncc.getMa(), qlncc.getDiaChi(), qlncc.getTen(), qlncc.getSdt(), qlncc.getEmail(), qlncc.getTrangThai());
       if(iNhaCungCapRepository.SaveOrUpdate(nhaCungCap)){
         return "Update compelte";
       }
       else{
       return "Update fail";
       }
    }

    @Override
    public String delete(QLNhaCungCap qlncc) {
     NhaCungCap nhaCungCap = new  NhaCungCap(qlncc.getId(), qlncc.getMa(), qlncc.getDiaChi(), qlncc.getTen(), qlncc.getSdt(), qlncc.getEmail(), qlncc.getTrangThai());
       if(iNhaCungCapRepository.delete(nhaCungCap)){
         return "Delete compelte";
       }
       else{
       return "Delete fail";
       }    }

    @Override
    public String khoiPhuc(QLNhaCungCap qlncc) {
      NhaCungCap nhaCungCap = new  NhaCungCap(qlncc.getId(),null, null,null,null, null, qlncc.getTrangThai());
       if(iNhaCungCapRepository.SaveOrUpdate(nhaCungCap)){
         return "Update compelte";
       }
       else{
       return "Update fail";
       }
    }
    
}

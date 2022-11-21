/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositorys.impl;

import DomainModel.NhaCungCap;
import Repositorys.INhaCungCapRepository;
import Utill.HiberUtill;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hibernate.Transaction;


/**
 *
 * @author ongbi
 */
public class NhaCungCapRepository implements INhaCungCapRepository{

    @Override
    public List<NhaCungCap> getAll() {
     String hql = "From NhaCungCap";
        try ( Session session = HiberUtill.getFACTORY().openSession()){
           Query q = session.createQuery(hql);
           return q.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean SaveOrUpdate(NhaCungCap nhaCungCap) {
        boolean check;
        Transaction transaction = null;
        try (Session session = HiberUtill.getFACTORY().openSession()){
          transaction = session.beginTransaction();
          session.saveOrUpdate(nhaCungCap);
          check=true;
          transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            check = false;
            transaction.rollback();
        }
       return check;
    }

    @Override
    public boolean delete(NhaCungCap nhaCungCap) {
   boolean check;
        Transaction transaction = null;
        try (Session session = HiberUtill.getFACTORY().openSession()){
          transaction = session.beginTransaction();
          session.delete(nhaCungCap);
          check=true;
          transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            check = false;
            transaction.rollback();
        }
       return check;
    }
      public boolean khoiPhuc(NhaCungCap nhaCungCap) {
 boolean check;
        Transaction transaction = null;
        try ( Session session = new HiberUtill().getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(nhaCungCap);
            check = true;
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            check = false;
            transaction.rollback();
        }
        return check;
    }
     public static void main(String[] args) {
         System.out.println(new NhaCungCapRepository().getAll().size());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 728636
 */
public class EnumTest {
    enum UserStatus {
        PENDING,
        ACTIVE,
        INACTIVE,
        DELETED;
        
        public static void main(String ar[]){
            System.out.println("Userstatus: " + UserStatus.ACTIVE);
        }
    };
}

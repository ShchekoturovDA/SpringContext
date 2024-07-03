package sber.spring.SpringContextBank;

import lombok.Data;

@Data
public class Application {
    String nickName;
    Double amount;

    public void checkClientExistence(String nickName, BankClientsApp bankClientsApp){

    }

    public void transact(String nickName, int amount, TransferByPhone transferByPhone){

    }

    public void writeDown(String nickName, int amount, Database database){
        
    }
}

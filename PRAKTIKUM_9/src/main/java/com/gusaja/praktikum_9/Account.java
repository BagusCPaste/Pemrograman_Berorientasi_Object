package com.gusaja.praktikum_9;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bismillah
 */
public class Account{
    protected double balance ; 
    protected Account(double initBalance) {
        int
        balance = (int) initBalance; 
    } 
    public double getBalance() { 
        return balance; 
    } 
    public void deposit(double amt){ 
        balance = balance +amt; 
    } 
    public void withdraw(double amt) throws OverdraftException{ 
        if (amt<=balance) { 
            balance = balance - amt; 
        } else { 
            throw new OverdraftException("Dana Anda tidak cukup", amt-balance); 
        } 
   } 
} 
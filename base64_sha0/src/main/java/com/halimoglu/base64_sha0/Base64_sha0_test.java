/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.halimoglu.base64_sha0;

import java.util.Base64;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

/**
 *
 * @author fhali
 */
public class Base64_sha0_test {

    public static void main(String[] args) throws DecoderException {
        String password = "pass123";
        System.out.println("base64(sha0(" + password + ")) = "
                + Base64.getEncoder().encodeToString(
                        Hex.decodeHex(
                                Sha0.hash(password)
                        )
                )
        );

    }
}

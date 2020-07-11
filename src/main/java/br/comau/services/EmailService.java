package br.comau.services;

import br.comau.domain.ClienteFisica;

public interface EmailService {

    //void sendEmail(SimpleMailMessage msg);
    void sendNewPasswordEmail(ClienteFisica clienteFisica, String senha);
}

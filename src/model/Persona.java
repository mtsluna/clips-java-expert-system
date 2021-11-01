/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import lombok.Builder;
import lombok.Data;

/**
 *
 * @author MtsSk
 */
@Data
@Builder
public class Persona {
    private String edad;
    private String grupo;
    private String visitaPrevia;
}

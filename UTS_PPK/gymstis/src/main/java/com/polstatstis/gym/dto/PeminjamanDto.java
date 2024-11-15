package com.polstatstis.gym.dto;

/**
 * @author gildbran
 */

import com.polstatstis.gym.entity.Gym;
import com.polstatstis.gym.entity.User;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PeminjamanDto {
    private int idPeminjaman;
    
    private User user;
    
    private Gym gym;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date waktuPeminjaman;
    
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date waktuPengembalian;

    private int jumlahOrang;
}

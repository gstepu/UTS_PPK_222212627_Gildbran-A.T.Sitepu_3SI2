package com.polstatstis.gym.mapper;

/*
 * @author gildbran
 */

import com.polstatstis.gym.dto.PeminjamanDto;
import com.polstatstis.gym.entity.Peminjaman;

public class PeminjamanMapper {
    static Peminjaman mapToPeminjaman(PeminjamanDto peminjamanDto){
        return Peminjaman.builder()
            .idPeminjaman(peminjamanDto.getIdPeminjaman())
            .user(peminjamanDto.getUser())
            .gym(peminjamanDto.getGym())
            .waktuPeminjaman(peminjamanDto.getWaktuPeminjaman())
            .waktuPengembalian(peminjamanDto.getWaktuPengembalian())
                .jumlahOrang(peminjamanDto.getJumlahOrang())
            .build();
    }
    public static PeminjamanDto mapToPeminjamanDto(Peminjaman peminjaman){
        return PeminjamanDto.builder()
            .idPeminjaman(peminjaman.getIdPeminjaman())
            .user(peminjaman.getUser())
            .gym(peminjaman.getGym())
            .waktuPeminjaman(peminjaman.getWaktuPeminjaman())
            .waktuPengembalian(peminjaman.getWaktuPengembalian())
                .jumlahOrang(peminjaman.getJumlahOrang())
            .build();
    }
}

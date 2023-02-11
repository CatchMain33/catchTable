package com.catchmind.catchtable.dto.network.response;

import com.catchmind.catchtable.dto.ProfileDto;
import com.catchmind.catchtable.dto.ResAdminDto;
import com.catchmind.catchtable.dto.ReserveDto;
import com.catchmind.catchtable.dto.ReviewPhotoDto;

import java.util.List;

public record IndexResponse(
        long revIdx,
        ProfileDto profileDto,
        String revContent,
        double revScore,
        ResAdminDto resAdminDto,
        List<ReviewPhotoDto> photo,
        ReserveDto reserve
) {
}
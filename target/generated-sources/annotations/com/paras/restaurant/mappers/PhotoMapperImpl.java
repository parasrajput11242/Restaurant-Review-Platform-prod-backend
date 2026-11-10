package com.paras.restaurant.mappers;

import com.paras.restaurant.domain.dtos.PhotoDto;
import com.paras.restaurant.domain.entities.Photo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-11-08T09:56:56+0530",
    comments = "version: 1.6.3, compiler: javac, environment: Java 25.0.2 (Oracle Corporation)"
)
@Component
public class PhotoMapperImpl implements PhotoMapper {

    @Override
    public PhotoDto toDto(Photo photo) {
        if ( photo == null ) {
            return null;
        }

        PhotoDto.PhotoDtoBuilder photoDto = PhotoDto.builder();

        photoDto.url( photo.getUrl() );
        photoDto.uploadDate( photo.getUploadDate() );

        return photoDto.build();
    }
}

package io.github.kauanmeira.imageliteapi.domain.entity;

import io.github.kauanmeira.imageliteapi.domain.enums.ImageExtension;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Table
@EntityListeners(AuditingEntityListener.class)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column
    private String name;
    @Column
    private Long size;
    @Column
    @Enumerated(EnumType.STRING)
    private ImageExtension extension;
    @Column
    @CreatedDate
    private LocalDateTime uploadDate;
    @Column
    private String tags;
    @Column
    @Lob
    private byte[] file;

    public String getFileName() {
        return getName().concat(".").concat(getExtension().name());
    }


}
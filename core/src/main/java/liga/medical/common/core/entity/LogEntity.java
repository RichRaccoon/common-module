package liga.medical.common.core.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "debug")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LogEntity {
    @Id
    @Column(name = "uuid")
    private String uuid;

    @Column(name = "system_type_id")
    private int systemTypeId;

    @Column(name = "method_params")
    private String methodParams;
}

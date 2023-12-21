package com.example.demo.model;

import com.example.demo.utility.EventType;
import io.swagger.annotations.ApiModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@ApiModel(description = "All details about Clock In/Clock Out Revision History")
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "clock_data_revision")
public class ClockDataRevision {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @OneToOne
    private Employee employee;
    @Enumerated(EnumType.STRING)
    private com.example.demo.utility.EventType EventType;
    private LocalDateTime EventTimestamp;

    public ClockDataRevision(Employee employee, EventType eventType, LocalDateTime eventTimestamp) {
        this.employee = employee;
        EventType = eventType;
        EventTimestamp = eventTimestamp;
    }
}

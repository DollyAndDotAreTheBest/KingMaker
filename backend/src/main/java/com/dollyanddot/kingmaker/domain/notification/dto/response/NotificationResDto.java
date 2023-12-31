package com.dollyanddot.kingmaker.domain.notification.dto.response;

import com.dollyanddot.kingmaker.domain.notification.domain.Notification;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotificationResDto {
    String message;
    int notificationTypeId;
    Long notificationId;
    LocalDateTime sendTime;

    public static NotificationResDto toDto(Notification entity) {
        return NotificationResDto.builder()
                .message(entity.getMessage())
                .notificationTypeId(entity.getNotificationType().getNotificationTypeId())
                .notificationId(entity.getNotificationId())
                .sendTime(entity.getCreatedAt())
                .build();
    }

}

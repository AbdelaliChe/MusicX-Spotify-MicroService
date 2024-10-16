package che.music.commentservice.dto;

import lombok.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class CommentReadDTO {
	private Long id;
	private Long experienceId;
	private String userId;
	private String content;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private User user;
}

package dio.me.boardtarefas.dto;

import dio.me.boardtarefas.persistence.entity.BoardColumnKindEnum;

public record BoardColumnInfoDTO(Long id, int order, BoardColumnKindEnum kind) {
    
}

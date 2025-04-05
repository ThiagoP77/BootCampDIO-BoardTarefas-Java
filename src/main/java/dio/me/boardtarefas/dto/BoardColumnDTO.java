package dio.me.boardtarefas.dto;

import dio.me.boardtarefas.persistence.entity.BoardColumnKindEnum;

public record BoardColumnDTO(Long id,
                             String name,
                             BoardColumnKindEnum kind,
                             int cardsAmount) {
}

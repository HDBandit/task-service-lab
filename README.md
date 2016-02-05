# task-service-lab

Ejemplo de endpoint donde el RequestBody es un tipo genérico, del cual extienden varios subtipos.

Para solucionar el problema de la deserialización de tipos polimórficos con Jackson, la librería soporta varias notaciones:
@JsonTypeInfo y @JsonSubTypes.

De la misma manera swagger también es capaz de documentar y soportar polimorfismo. La anotación @ApiModel tiene un atributo parent
para indicar la clase padre, y otro llamado subTypes para indiciar las clases hijas.

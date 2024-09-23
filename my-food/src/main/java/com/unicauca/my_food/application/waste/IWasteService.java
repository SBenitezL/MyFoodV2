package com.unicauca.my_food.application.waste;

import java.util.List;

import com.unicauca.my_food.domain.waste.Waste;
import com.unicauca.my_food.domain.waste.value_objects.CauseWaste;
import com.unicauca.my_food.domain.waste.value_objects.ProductWaste;

/**
 * Interfaz para gestionar las operaciones relacionadas con el desperdicio de alimentos
 */
public interface IWasteService {
    /**
     * Crea un nuevo registro de desperdicio.
     *
     * @param waste El objeto Waste que contiene la información del desperdicio a crear.
     * @return El objeto Waste creado.
     */
    public Waste createWaste(Waste waste);

    /**
     * Obtiene un desperdicio existente por su ID.
     *
     * @param wasteId El ID del desperdicio que se desea obtener.
     * @return El objeto Waste correspondiente al ID proporcionado.
     */
    public Waste getWasteById(String wasteId);

    /**
     * Obtiene una lista de todos los registros de desperdicio.
     *
     * @return Una lista de objetos Waste que representan todos los desperdicios.
     */
    public List<Waste> getAllWaste();

    /**
     * Actualiza un registro de desperdicio existente.
     *
     * @param wasteId El ID del desperdicio a actualizar.
     * @param waste El objeto Waste que contiene los nuevos datos.
     */
    public void updateWaste(String wasteId, Waste waste);

    /**
     * Elimina un registro de desperdicio por su ID.
     *
     * @param wasteId El ID del desperdicio que se desea eliminar.
     */
    public void deleteWaste(String wasteId);

    /**
     * Registra una cantidad de desperdicio adicional a un registro existente.
     *
     * @param wasteId El ID del desperdicio al que se desea añadir la cantidad.
     * @param quantity La cantidad de desperdicio a registrar.
     */
    public void registerWaste(String wasteId, double quantity);

    /**
     * Sugiere medidas de reducción para un registro de desperdicio basado en su cantidad.
     *
     * @param wasteId El ID del desperdicio para el cual se desean sugerencias de reducción.
     */
    public void suggestReductionMeasures(String wasteId);

    /**
     * Obtiene los detalles de un producto asociado a un desperdicio.
     *
     * @param product El objeto ProductWaste que representa el producto.
     * @return Una cadena que contiene los detalles del producto.
     */
    public String getDetailsProduct(ProductWaste product);

    /**
     * Selecciona una causa de desperdicio de una lista basada en un índice proporcionado.
     *
     * @param cause El objeto CauseWaste que representa la causa.
     * @param causeIndex El índice de la causa seleccionada.
     * @return Una cadena que representa la causa seleccionada.
     */
    public String selectCause(CauseWaste cause, int causeIndex);
}

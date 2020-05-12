var destCity = function(paths) {
    let arrayFlatten = paths.flat(1);
    let uniqueValues = [...new Set(arrayFlatten)];
    return uniqueValues[uniqueValues.length -1];
};
destCity([["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]])

/*
 * Copyright © 2022 JINSPIRED B.V.
 */

package io.calculis.counters.spi.alpha;

import io.humainary.counters.Counters;
import io.humainary.counters.spi.CountersProvider;
import io.humainary.substrates.sdk.AbstractContextProvider;

/**
 * The SPI implementation of {@link CountersProvider}.
 *
 * @author wlouth
 * @since 1.0
 */

final class Provider
  extends AbstractContextProvider< Counters.Counter, Context >
  implements CountersProvider {

  Provider () {

    super (
      environment ->
        new Context (
          environment,
          Counter::new
        )
    );

  }

}

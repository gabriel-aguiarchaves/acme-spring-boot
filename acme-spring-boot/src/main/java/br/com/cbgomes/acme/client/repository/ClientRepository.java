/**
 * 
 */
package br.com.cbgomes.acme.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cbgomes.acme.client.domain.Client;

/**
 * @author cbgomes
 *
 */
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}

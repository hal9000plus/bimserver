package org.bimserver.client;

/******************************************************************************
 * (c) Copyright bimserver.org 2009
 * Licensed under GNU GPLv3
 * http://www.gnu.org/licenses/gpl-3.0.txt
 * For more information mail to license@bimserver.org
 *
 * Bimserver.org is free software: you can redistribute it and/or modify 
 * it under the terms of the GNU General Public License as published by 
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Bimserver.org is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License a 
 * long with Bimserver.org . If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.bimserver.shared.SCheckout;
import org.bimserver.shared.SProject;
import org.bimserver.shared.SUser;

public class CheckoutsPanel extends JPanel {

	private static final long serialVersionUID = -8031235575978078294L;

	private CheckoutTableModel checkoutTableModel;
	private JTable checkoutTable;

	public CheckoutsPanel(ServiceHolder serviceHolder, final Client testWindow) {
		setLayout(new BorderLayout());
		JLabel label = new JLabel("Checkouts");
		add(label, BorderLayout.NORTH);
		
		checkoutTableModel = new CheckoutTableModel(serviceHolder);
		checkoutTable = new JTable();

		checkoutTable.setModel(checkoutTableModel);

		checkoutTable.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent mouseEvent) {
				if (mouseEvent.getClickCount() == 2 && mouseEvent.getButton() == MouseEvent.BUTTON1) {
					final SCheckout checkout = checkoutTableModel.getCheckout(checkoutTable.getSelectedRow());
					File tmp = new File("tmp");
					if (!tmp.isDirectory()) {
						tmp.mkdir();
					}
					File file = new File(tmp, checkout.getProjectName() + "." + checkout.getRevisionId() + ".ifc");
					try {
						testWindow.download(checkout.getProjectId(), checkout.getRevisionId(), new FileOutputStream(file), false);
						Desktop.getDesktop().open(file);
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		JScrollPane scrollpaneCheckouts = new JScrollPane(checkoutTable);
		add(scrollpaneCheckouts, BorderLayout.CENTER);
	}

	public void showProject(SProject project) {
		checkoutTableModel.showProject(project);
	}

	public void showUser(SUser user) {
		checkoutTableModel.showUser(user);
	}
}
